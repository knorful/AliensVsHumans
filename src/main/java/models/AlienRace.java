package models;

import lombok.Getter;

@Getter
public enum AlienRace {
    MARTIAN(100, 50, 25, new String[]{"Telepathy", "Invisibility"}),
    VENUSIAN(120, 60, 30, new String[]{"Flight", "Regeneration"}),
    JUPITERIAN(150, 40, 40, new String[]{"Strength", "Resistance"});

    // Getters
    private final int maxHealth;
    private final int maxFP;
    private final int attackPower;
    private final String[] skills;

    AlienRace(int maxHealth, int maxFP, int attackPower, String[] skills) {
        this.maxHealth = maxHealth;
        this.maxFP = maxFP;
        this.attackPower = attackPower;
        this.skills = skills;
    }

}
