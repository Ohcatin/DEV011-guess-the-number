import java.util.ArrayList;
import java.util.List;
abstract class Player {
    protected String name;
    protected List<Integer> guesses;

    // Constructor
    public Player(String name) {
        this.name = name;
        this.guesses = new ArrayList<>();
    }

    // Método abstracto
    public abstract int makeGuess();

    // nombre
    public String getName() {
        return name;
    }

    // historial
    public List<Integer> getGuesses() {
        return guesses;
    }
}