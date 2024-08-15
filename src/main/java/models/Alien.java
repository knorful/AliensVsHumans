package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Alien {
    private AlienRace race;
    private int currentHealth;
    private int currentFP;
    private Boolean isMutated;

    //method that receives race of alien to set opponent for Human
    public Alien(AlienRace race) {
        this.race = race;
        this.currentHealth = race.getMaxHealth();
        this.currentFP = race.getMaxFP();
        this.isMutated = false;
    }

    /*
    * This method will allow alien to regenerate if maxHealth is not full
    * Regeneration will cause fp depletion
    * args: takes in AlienRace race
    */
    public String regenerateHealth(int regenerationAmount, int fpCost) {
        //TODO: write logic to have health max out at maxHealth and not let alien regenerate passed this limit
        if (this.currentFP - fpCost >= 0) {
            if (this.currentHealth < race.getMaxHealth()) {
                this.currentHealth = Math.min(regenerationAmount + this.currentHealth, race.getMaxHealth());
                return "regenerateHealth casted. Current health is: " + this.currentHealth;
            } else {
                return "Health is already maxed!";
            }
        } else {
            return "Not enough FP to cast regenerateHeath!";
        }
    }

    public void takeDamage(int damage) {
        this.currentHealth -= damage;
        if (this.currentHealth < 0) {
            this.currentHealth = 0;
        }
    }

    public int dealDamage() {
        return this.race.getAttackPower();
    }

    //TODO: Write logic for special skills and/or abilities based on alien race
    //TODO: Allow the ability to mutate
        //TODO: Conditions in which mutation happens?
    //TODO: Different alien races will do different things
}
