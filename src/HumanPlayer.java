import java.util.Scanner;
class HumanPlayer extends Player {
    // Constructor
    public HumanPlayer(String name) {
        super(name);
    }

    // Implementación del método para hacer una suposición
    @Override
    public int makeGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(name + ", ingresa tu suposición: ");
        int guess = scanner.nextInt();
        guesses.add(guess);
        return guess;
    }
}