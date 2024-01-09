import java.util.Random;
class ComputerPlayer extends Player {
    // Constructor
    public ComputerPlayer(String name) {
        super(name);
    }

    // Implementación del método para hacer una suposición
    @Override
    public int makeGuess() {
        // Aquí puedes implementar la lógica para que la computadora haga una suposición automática
        // En este ejemplo, simplemente se elige un número aleatorio entre 1 y 100
        int guess = new Random().nextInt(100) + 1;
        guesses.add(guess);
        return guess;
    }
}