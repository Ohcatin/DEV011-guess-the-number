import java.util.Random;
class ComputerPlayer extends Player {
    // Constructor
    public ComputerPlayer(String name) {
        super(name);
    }

    @Override
    public int makeGuess() {
        int guess = new Random().nextInt(100) + 1;
        guesses.add(guess);
        return guess;
    }
}