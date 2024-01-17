import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear objetos de jugador humano y computadora
        Player humanPlayer = new HumanPlayer("Player");
        Player computerPlayer = new ComputerPlayer("Computer player");

        // Aquí se genera el número 1 al 100
        int targetNumber = generateRandomNumber();

        System.out.println("Welcome to the guess the number game!");
        System.out.println("I have selected a number between 1 and 100. Guess!");

        boolean gameWon = false;

        while (!gameWon) {
            // Turno de player
            gameWon = checkGuess(humanPlayer, targetNumber);

            // Verificar si el juego ha terminado después del intento de player
            if (gameWon) {
                break;
            }

            // Turno de computer
            gameWon = checkGuess(computerPlayer, targetNumber);
        }

        scanner.close();
    }

    private static int generateRandomNumber() {
        return new Random().nextInt(100) + 1;
    }

    protected static boolean checkGuess(Player player, int targetNumber) {
        int playerGuess = player.makeGuess();
        System.out.println(player.getName() + " enter you guess: " + playerGuess);

        if (playerGuess == targetNumber) {
            System.out.println("Congratulations! " + player.getName() + " you guessed the number");
            displayGuesses(player);
            return true; // juego ganado
        } else {
            displayHint(playerGuess, targetNumber);
            return false; // juego sigue
        }
    }

    private static void displayHint(int guess, int target) {
        if (guess < target) {
            System.out.println("Too low");
        } else {
            System.out.println("Too high");
        }
    }

    private static void displayGuesses(Player player) {
        System.out.println(player.getName() + " has these attempts: " + player.getGuesses());
        System.out.println("Total attempts: " + player.getGuesses().size());
    }
}
