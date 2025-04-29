package The_Heros_Adventure.Classes;

import The_Heros_Adventure.Interfaces.Attackable;

public abstract class Hero implements Attackable {
    private String hero_name;
    private String hero_class;
    private int health;
    private final int MAX_HEALTH;

    public Hero(String hero_name, String  hero_class, int health) {
        this.hero_name = hero_name;
        this.hero_class = hero_class;

        this.health = health;
        this.MAX_HEALTH = health;
    }

    public String getHero_name() {
        return hero_name;
    }

    public void setHero_name(String hero_name) {
        this.hero_name = hero_name;
    }

    public String  getHero_class() {
        return hero_class;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMAX_HEALTH() {
        return MAX_HEALTH;
    }
}
