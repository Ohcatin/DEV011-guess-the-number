import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuessTheNumberGameTest {

    @Test
    public void testCheckGuess_PlayerWins() {
        // objetos con mockito
        Player player = Mockito.mock(Player.class);

        // esperado
        Mockito.when(player.makeGuess()).thenReturn(42);
        Mockito.when(player.getName()).thenReturn("Player");

        boolean result = GuessTheNumberGame.checkGuess(player, 42);

        // resultado
        assertTrue(result);

        // interacciones esperadas
        Mockito.verify(player, Mockito.times(3)).getName();
        Mockito.verify(player, Mockito.times(1)).makeGuess();
    }

    @Test
    public void testCheckGuess_PlayerContinues() {
        // objetos con Mockito
        Player player = Mockito.mock(Player.class);

        // comportamiento esperado
        Mockito.when(player.makeGuess()).thenReturn(23);
        Mockito.when(player.getName()).thenReturn("Player");

        // lógica
        boolean result = GuessTheNumberGame.checkGuess(player, 42);

        assertFalse(result);

        Mockito.verify(player, Mockito.times(1)).getName();
        Mockito.verify(player, Mockito.times(1)).makeGuess();
    }
}
