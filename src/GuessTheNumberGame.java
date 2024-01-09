import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear objetos de jugador humano y computadora
        Player humanPlayer = new HumanPlayer("Jugador Humano");
        Player computerPlayer = new ComputerPlayer("Computadora");

        // Generar un número aleatorio entre 1 y 100
        int targetNumber = generateRandomNumber();

        System.out.println("Bienvenido al juego de adivinar el número!");
        System.out.println("He seleccionado un número entre 1 y 100. ¡Adivina!");

        while (true) {
            // Adivinanza del jugador humano
            int userGuess = humanPlayer.makeGuess();

            if (userGuess == targetNumber) {
                System.out.println("¡Felicidades! ¡Has adivinado el número correctamente!");
                break;
            } else {
                displayHint(userGuess, targetNumber);
            }

            // Adivinanza de la computadora
            int computerGuess = computerPlayer.makeGuess();

            System.out.println("La computadora adivina: " + computerGuess);

            if (computerGuess == targetNumber) {
                System.out.println("¡La computadora ha adivinado el número correctamente!");
                break;
            } else {
                displayHint(computerGuess, targetNumber);
            }
        }

        scanner.close();
    }

    // Genera un número aleatorio entre 1 y 100
    private static int generateRandomNumber() {
        return new Random().nextInt(100) + 1;
    }

    // Muestra una pista basada en la adivinanza
    private static void displayHint(int guess, int target) {
        if (guess < target) {
            System.out.println("Demasiado bajo. Intenta de nuevo.");
        } else {
            System.out.println("Demasiado alto. Intenta de nuevo.");
        }
    }
}
