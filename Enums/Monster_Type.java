package The_Heros_Adventure.Enums;

public enum Monster_Type {
    COELHO(20, 5), ERVA_DANINHA(35, 15), TOURO_DE_PEDRA(100, 30), SARCEDOTE_FIEL(150, 41), DRAGAO_CRISTALIZADO(250, 50), FENIX_DE_GELO(290, 60);

    private int health;
    private int damage;

    Monster_Type(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }
}
