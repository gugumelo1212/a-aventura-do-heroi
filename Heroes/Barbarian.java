package The_Heros_Adventure.Heroes;

import The_Heros_Adventure.Classes.Hero;
import The_Heros_Adventure.Managers.System_Manager;

public class Barbarian extends Hero {
    public Barbarian(String hero_name, String hero_class, int health) {
        super(hero_name, hero_class, health);
    }

    @Override
    public int attack() {
        System.out.println("Suas opções:");
        System.out.println("[ 0 ] Arremessar machado (110d)");
        System.out.println("[ 1 ] Socar (20d)");

        while (true) {
            switch (Integer.parseInt(System_Manager.getScan().nextLine().trim())) {
                case 0:
                    System.out.println("ARREMESSO MEU MACHADO!");
                    return 110;
                case 1:
                    System.out.println("SOCO O INIMIGO!");
                    return 20;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}