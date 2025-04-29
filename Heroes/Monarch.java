package The_Heros_Adventure.Heroes;

import The_Heros_Adventure.Classes.Hero;
import The_Heros_Adventure.Managers.System_Manager;

public class Monarch extends Hero {
    public Monarch(String hero_name, String hero_class, int health) {
        super(hero_name, hero_class, health);
    }

    @Override
    public int attack(){
        System.out.println("Suas opções:");
        System.out.println("[ 0 ] Ordem real (80d)");
        System.out.println("[ 1 ] Cajadada do rei (80d)");

        while(true){
            switch(Integer.parseInt(System_Manager.getScan().nextLine().trim())){
                case 0:
                    System.out.println("ORDENO MEUS GUARDAS!");
                    return 80;
                case 1:
                    System.out.println("ATACO COM MEU CAJADO!");
                    return 80;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
