package The_Heros_Adventure.Classes;

import The_Heros_Adventure.Enums.Monster_Type;
import The_Heros_Adventure.Interfaces.Attackable;

public class Monster implements Attackable {
    private Monster_Type monster_type;
    private int damage;
    private int health;
    private final int MAX_HEALTH;

    public Monster(Monster_Type monster_type) {
        this.monster_type = monster_type;

        damage = monster_type.getDamage();
        health = monster_type.getHealth();
        MAX_HEALTH = health;
    }

    @Override
    public int attack(){
        return damage;
    }

    public Monster_Type getMonster_type() {
        return monster_type;
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
