package The_Heros_Adventure;

import The_Heros_Adventure.Managers.Heroes_Manager;
import The_Heros_Adventure.Managers.Interface_Manager;
import The_Heros_Adventure.Managers.System_Manager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo a A Aventura do Herói!");
        while(System_Manager.isSystem_open()){
            Interface_Manager.showMenuInterface();
            switch(Integer.parseInt(System_Manager.getScan().nextLine())){
                case 0:
                    Heroes_Manager.createNewHero();
                    break;
                case 1:
                    Heroes_Manager.deleteHero();
                    break;
                case 2:
                    Heroes_Manager.showMyHeroes();
                    break;
                case 3:
                    Heroes_Manager.renameHero();
                    break;
                case 4:
                    Heroes_Manager.attackWithHero();
                    break;
                case 5:
                    System_Manager.exitSystem();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
