package The_Heros_Adventure.Managers;

import The_Heros_Adventure.Classes.Hero;
import The_Heros_Adventure.Classes.Monster;
import The_Heros_Adventure.Enums.Monster_Type;
import The_Heros_Adventure.Heroes.*;

import java.util.ArrayList;
import java.util.Random;

public class Heroes_Manager {
    private static ArrayList<Hero> heroes_list = new ArrayList<Hero>();

    public static void createNewHero(){
        Interface_Manager.showHeader("CRIAR NOVO HERÓI");

        System.out.println("Nome do herói:");
        String hero_name = System_Manager.getScan().nextLine().trim();

        System.out.println("Classe do herói: [ELFO, ALQUIMISTA, MAGO, MONARCA, BARBARO]");
        String hero_class = System_Manager.getScan().nextLine().trim();

        for(Hero hero : heroes_list){
            if(hero.getHero_name().equals(hero_name)){
                System.out.println("Esse nome já existe.");
                return;
            }
        }

        switch(hero_class){
            case "ELFO":
                heroes_list.add(new Elf(hero_name, hero_class, 290));
                break;
            case "ALQUIMISTA":
                heroes_list.add(new Alchemist(hero_name, hero_class, 150));
                break;
            case "MAGO":
                heroes_list.add(new Wizard(hero_name, hero_class, 250));
                break;
            case "MONARCA":
                heroes_list.add(new Monarch(hero_name, hero_class, 300));
                break;
            case "BARBARO":
                heroes_list.add(new Barbarian(hero_name, hero_class, 500));
                break;
            default:
                System.out.println("Classe inválida.");
                return;
        }

        System.out.println("Herói " + hero_name + " criado com sucesso.");
    }

    public static void deleteHero(){
        Interface_Manager.showHeader("DELETAR HERÓI");

        System.out.println("Nome do herói:");
        String hero_name = System_Manager.getScan().nextLine().trim();

        Hero hero_object = null;

        for(Hero hero : heroes_list){
            if(hero.getHero_name().equals(hero_name)){
                hero_object = hero;
            }
        }
        if(hero_object == null){
            System.out.println("Herói inválido.");
            return;
        }

        heroes_list.remove(hero_object);
        System.out.println("Herói " + hero_name + " deletado com sucesso.");
    }

    public static void showMyHeroes() {
        Interface_Manager.showHeader("MOSTRAR MEUS HERÓIS");

        for(Hero hero : heroes_list){
            System.out.println(hero.getHero_name() + " | " + hero.getHero_class());
        }
    }

    public static void renameHero(){
        Interface_Manager.showHeader("RENOMEAR HERÓI");

        System.out.println("Nome do herói:");
        String old_hero_name = System_Manager.getScan().nextLine().trim();

        System.out.println("Novo nome do herói:");
        String new_hero_name = System_Manager.getScan().nextLine().trim();

        Hero hero_obj = null;

        for(Hero hero : heroes_list){
            if(hero.getHero_name().equals(old_hero_name)){
                hero_obj = hero;
            }
        }
        if(hero_obj == null){
            System.out.println("Herói inválido.");
            return;
        }

        if(old_hero_name.equals(new_hero_name)){
            System.out.println("O nome antigo e o nome novo são iguais.");
            return;
        }

        hero_obj.setHero_name(new_hero_name);
        System.out.println("Herói " + old_hero_name + " renomeado com sucesso para " + new_hero_name);
    }

    public static void attackWithHero() {
        Interface_Manager.showHeader("ATACAR COM HERÓI");

        System.out.println("Nome do herói:");
        String hero_name = System_Manager.getScan().nextLine().trim();

        Hero hero_object = null;

        for (Hero hero : heroes_list) {
            if (hero.getHero_name().equals(hero_name)) {
                hero_object = hero;
            }
        }
        if (hero_object == null) {
            System.out.println("Herói inválido.");
            return;
        }

        Attack_Manager.startFight(hero_object);
    }
}
