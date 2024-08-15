package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Human {
    private String name;
    private int attackPower;
    private Boolean hasArmor;
    private int currentHealth;

    private void consumeFoodItem(Food food) {
        //TODO: write functionality to have Human consume food and be given special effects
            //HP upgrade
            //FP upgrade to cast spells
    }
    private void pickUpArmor(Armor armor) {
        //write functionality to add armor to Human
        this.hasArmor = true;
    }

    public int dealDamage() {
        return this.getAttackPower();
    }

    public void takeDamage(int damage) {
        if (this.hasArmor) {
            damage -= 5;
            System.out.println("Human armor equipped! Damage reduced by 5");
        }
        this.currentHealth -= damage;
        if (this.currentHealth < 0) {
            this.currentHealth = 0;
        }
    }

//    private void increaseHealth(int amountToIncrease) {
//        this.health += amountToIncrease;
//    }
}
