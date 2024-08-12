package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Alien extends Entity{
    private static int fp = 10;
    private static int maxHealth = 15;
    public enum AlienRace {
        MARTIAN,
        VENUSIAN,
        JUPITERIAN
    }
    private Boolean isMutated;
    private AlienRace race;

    private String regenerateHealth() {
        //write logic to have health max out at maxHealth and not let
        //alien regenerate passed this limit
        return "This alien's current health is: " + this.getHealth();
    }
}
