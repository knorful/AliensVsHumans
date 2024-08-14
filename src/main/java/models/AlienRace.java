package models;

import lombok.Getter;

@Getter
public enum AlienRace {
    MARTIAN(100, 50, new String[]{"Telepathy", "Invisibility"}),
    VENUSIAN(120, 60, new String[]{"Flight", "Regeneration"}),
    JUPITERIAN(150, 40, new String[]{"Strength", "Resistance"});

    // Getters
    private final int maxHealth;
    private final int maxFP;
    private final String[] skills;

    AlienRace(int maxHealth, int maxFP, String[] skills) {
        this.maxHealth = maxHealth;
        this.maxFP = maxFP;
        this.skills = skills;
    }

}
