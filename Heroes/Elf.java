package The_Heros_Adventure.Heroes;

import The_Heros_Adventure.Classes.Hero;
import The_Heros_Adventure.Managers.System_Manager;

public class Elf extends Hero {
    public Elf(String hero_name, String hero_class, int health) {
        super(hero_name, hero_class, health);
    }

    @Override
    public int attack(){
        System.out.println("Suas opções:");
        System.out.println("[ 0 ] Sumonar vinhas (10d)");
        System.out.println("[ 1 ] Ataque animal (40d)");

        while(true){
            switch(Integer.parseInt(System_Manager.getScan().nextLine().trim())){
                case 0:
                    System.out.println("SUMONO VINHAS!");
                    return 10;
                case 1:
                    System.out.println("ATACO COM ANIMAIS!");
                    return 40;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
