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

    private Boolean isMutated;
    private AlienRace race;

    /*
    * This method will allow alien to regenerate if maxHealth is not full
    * Regeneration will cause fp depletion of
    */
    private String regenerateHealth() {
        //TODO: write logic to have health max out at maxHealth and not let alien regenerate passed this limit
        //check max health
        return "This alien's current health is: " + this.getHealth();
    }

    //TODO: Write logic for special skills and/or abilities based on alien race
    //TODO: Allow the ability to mutate
        //TODO: Conditions in which mutation happens?
    //TODO: Different alien races will do different things
}
