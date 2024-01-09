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

    // Método abstracto para hacer una suposición
    public abstract int makeGuess();

    // Getter para obtener el nombre de la jugadora
    public String getName() {
        return name;
    }

    // Getter para obtener el historial de suposiciones
    public List<Integer> getGuesses() {
        return guesses;
    }
}