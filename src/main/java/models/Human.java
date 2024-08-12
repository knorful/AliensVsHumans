package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Human extends Entity{
    private Boolean hasArmor;
    private static int maxHealth = 50;

    private void consumeFoodItem(Food food) {
        //write functionality to have Human consume food and be grated special effects
        //HP upgrade
        //FP upgrade to cast spells
    }
    private void pickUpArmor(Armor armor) {
        //write functionality to add armor to Human
        this.hasArmor = true;
    }
}
