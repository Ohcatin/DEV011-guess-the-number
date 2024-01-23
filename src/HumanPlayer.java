import java.util.Scanner;
class HumanPlayer extends Player {
    // Constructor
    public HumanPlayer(String name) {
        super(name);
    }

    // Implementación del método
    @Override
    public int makeGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("––– Round: Human Player –––");
        System.out.print(name + ", enter the guess: ");
        int guess = scanner.nextInt();
        guesses.add(guess);
        return guess;
    }
}