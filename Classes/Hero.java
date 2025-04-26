package The_Heros_Adventure.Classes;

import The_Heros_Adventure.Enums.Class;

public class Hero {
    private String hero_name;
    private Class hero_class;

    public Hero(String hero_name, Class hero_class) {
        this.hero_name = hero_name;
        this.hero_class = hero_class;
    }

    public String getHero_name() {
        return hero_name;
    }

    public void setHero_name(String hero_name) {
        this.hero_name = hero_name;
    }

    public Class getHero_class() {
        return hero_class;
    }
}
