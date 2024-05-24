import org.example.PlayerCharacter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerCharacterTest {

    @Test
    void testGetX() {
        PlayerCharacter player = new PlayerCharacter();
        assertEquals(0, player.getX());
    }
    void testGetY() {
        PlayerCharacter player = new PlayerCharacter();
        assertEquals(0, player.getY());
    }

    void testGetW() {
        PlayerCharacter player = new PlayerCharacter();
        player.move('W');
        assertEquals(1, player.getY());
    }
}
