package models;

public enum AlienRace {
    MARTIAN(100, 50, new String[]{"Telepathy", "Invisibility"}),
    VENUSIAN(120, 60, new String[]{"Flight", "Regeneration"}),
    JUPITERIAN(150, 40, new String[]{"Strength", "Resistance"});

    private final int health;
    private final int focusPoints;
    private final String[] skills;

    AlienRace(int health, int fp, String[] skills) {
        this.health = health;
        this.focusPoints = fp;
        this.skills = skills;
    }

    // Getters
    public int getHealth() {
        return health;
    }

    public int getFocusPoints() {
        return focusPoints;
    }

    public String[] getSkills() {
        return skills;
    }
}
