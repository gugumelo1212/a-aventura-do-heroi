package The_Heros_Adventure.Heroes;

import The_Heros_Adventure.Classes.Hero;
import The_Heros_Adventure.Managers.System_Manager;

public class Wizard extends Hero {
    public Wizard(String hero_name, String hero_class, int health) {
        super(hero_name, hero_class, health);
    }

    @Override
    public int attack(){
        System.out.println("Suas opções:");
        System.out.println("[ 0 ] Magia instantânena (100d)");
        System.out.println("[ 1 ] Feitiço necromante (200d)");

        while(true){
            switch(Integer.parseInt(System_Manager.getScan().nextLine().trim())){
                case 0:
                    System.out.println("ALMADIÇO-O AGORA MESMO!");
                    return 100;
                case 1:
                    System.out.println("LANÇI FEITIÇO NECROMANTE!");
                    return 200;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
