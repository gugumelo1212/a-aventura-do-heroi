package The_Heros_Adventure.Managers;

import The_Heros_Adventure.Classes.Hero;
import The_Heros_Adventure.Classes.Monster;
import The_Heros_Adventure.Enums.Monster_Type;

import java.util.Random;

public class Attack_Manager {
    private static Monster[] monsters_list = {
            new Monster(Monster_Type.COELHO),
            new Monster(Monster_Type.ERVA_DANINHA),
            new Monster(Monster_Type.TOURO_DE_PEDRA),
            new Monster(Monster_Type.SARCEDOTE_FIEL),
            new Monster(Monster_Type.DRAGAO_CRISTALIZADO),
            new Monster(Monster_Type.FENIX_DE_GELO)
    };

    public static void startFight(Hero hero_object){
        Monster monster_object = chooseMonster();

        while(true){
            System.out.println("Herói ataca!");
            monster_object.setHealth(monster_object.getHealth() - hero_object.attack());
            if(monster_object.getHealth() < 0){
                monster_object.setHealth(0);
            }
            System.out.println("Vida do monstro: " + monster_object.getHealth());

            if(monster_object.getHealth() <= 0){
                System.out.println("Monstro morreu. HERÓI VENCE!");
                monster_object.setHealth(monster_object.getMAX_HEALTH());
                hero_object.setHealth(hero_object.getMAX_HEALTH());
                return;
            }

            System.out.println("Monstro ataca!");
            hero_object.setHealth(hero_object.getHealth() - monster_object.attack());
            if(hero_object.getHealth() < 0){
                hero_object.setHealth(0);
            }
            System.out.println("Vida do herói: " + hero_object.getHealth());

            if(hero_object.getHealth() <= 0){
                System.out.println("Herói morreu. HERÓI PERDEU!");
                hero_object.setHealth(hero_object.getMAX_HEALTH());
                monster_object.setHealth(monster_object.getMAX_HEALTH());
                return;
            }
        }
    }

    private static Monster chooseMonster(){
        while(true) {
            int random_index = chooseRandomIndex(Monster_Type.values().length);
            Monster random_monster = monsters_list[random_index];

            System.out.println("Aceita lutar contra... " + random_monster.getMonster_type() + "? (" + random_monster.getMonster_type().getDamage() + "d, " + random_monster.getMonster_type().getHealth() + "h)");
            System.out.println("[S]/[N]");

            switch(System_Manager.getScan().nextLine().toUpperCase().trim().charAt(0)){
                case 'S':
                    System.out.println("Iniciando confronto...");
                    return random_monster;
                case 'N':
                    System.out.println("Escolhendo outro monstro...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    private static int chooseRandomIndex(int limit){
        Random random = new Random();

        return random.nextInt(limit);
    }
}
