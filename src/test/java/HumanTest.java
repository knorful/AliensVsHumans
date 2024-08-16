import models.Human;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HumanTest {
    private Human human;

    @BeforeEach
    void setup() {
        human = new Human("Boog", 50, true, 100);
    }

    @Test
    void testInitialHealth() {
        assertEquals(100, human.getCurrentHealth(), "Initial health is 100");
    }

}
