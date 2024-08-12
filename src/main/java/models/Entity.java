package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Entity {
    private String name;
    private int health;
    private int baseAttack;
    private List<Skill> skills;
    private List<Weapon> weapons;

    private void increaseHealth(int amountToIncrease) {
        this.health += amountToIncrease;
    }
}
