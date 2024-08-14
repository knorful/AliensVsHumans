package models;

import lombok.Getter;

@Getter
public enum AlienRace {
    MARTIAN(100, 50, new String[]{"Telepathy", "Invisibility"}),
    VENUSIAN(120, 60, new String[]{"Flight", "Regeneration"}),
    JUPITERIAN(150, 40, new String[]{"Strength", "Resistance"});

    // Getters
    private final int health;
    private final int focusPoints;
    private final String[] skills;

    AlienRace(int health, int fp, String[] skills) {
        this.health = health;
        this.focusPoints = fp;
        this.skills = skills;
    }

}
