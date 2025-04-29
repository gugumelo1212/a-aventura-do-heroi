package The_Heros_Adventure.Heroes;

import The_Heros_Adventure.Classes.Hero;
import The_Heros_Adventure.Managers.System_Manager;

public class Alchemist extends Hero {
    public Alchemist(String hero_name, String hero_class, int health) {
        super(hero_name, hero_class, health);
    }

    @Override
    public int attack(){
        System.out.println("Suas opções:");
        System.out.println("[ 0 ] Arremessar poção (250d)");
        System.out.println("[ 1 ] Dardos flamejantes (50d)");

        while(true){
            switch(Integer.parseInt(System_Manager.getScan().nextLine().trim())){
                case 0:
                    System.out.println("ARREMESSO POÇÕES!");
                    return 250;
                case 1:
                    System.out.println("JOGO MEUS DARDOS FLAMEJANTES!");
                    return 50;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
