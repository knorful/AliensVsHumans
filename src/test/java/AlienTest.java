import models.Alien;
import models.AlienRace;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlienTest {

    private Alien martian;

    @BeforeEach
    void setUp() {
        martian = new Alien(AlienRace.MARTIAN);
    }

    @Test
    void testInitialHealth() {
        assertEquals(100, martian.getCurrentHealth(), "Initial health should be 100 for a Martian");
    }

    @Test
    void testTakeDamage() {
        martian.takeDamage(20);
        assertEquals(80, martian.getCurrentHealth(), "Health should decrease by 20 after taking damage");
    }

    @Test
    void testTakeDamageBeyondZero() {
        martian.takeDamage(120);
        assertEquals(0, martian.getCurrentHealth(), "Health should not go below 0");
    }

    @Test
    void testRegenerateHealth() {
        martian.takeDamage(50);
        String result = martian.regenerateHealth(30, 10);
        assertEquals(80, martian.getCurrentHealth(), "Health should be 80 after regeneration");
        assertEquals("regenerateHealth casted. Current health is: 80", result);
    }

    @Test
    void testRegenerateHealthWithInsufficientFP() {
        martian.takeDamage(50);
        String result = martian.regenerateHealth(30, 60);
        assertEquals(50, martian.getCurrentHealth(), "Health should remain unchanged due to insufficient FP");
        assertEquals("Not enough FP to cast regenerateHealth!", result);
    }

    @Test
    void testRegenerateHealthToMax() {
        martian.takeDamage(10);
        String result = martian.regenerateHealth(15, 5);
        assertEquals(100, martian.getCurrentHealth(), "Health should not exceed max health");
        assertEquals("regenerateHealth casted. Current health is: 100", result);
    }

    @Test
    void testRegenerateHealthWhenMax() {
        String result = martian.regenerateHealth(15, 10);
        assertEquals(100, martian.getCurrentHealth(), "Health should not be regenerated at max health");
        assertEquals("Health is already maxed!", result);
    }
}
