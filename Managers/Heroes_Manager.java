package The_Heros_Adventure.Managers;

import The_Heros_Adventure.Classes.Hero;
import The_Heros_Adventure.Enums.Class;

import java.util.ArrayList;

public class Heroes_Manager {
    private static ArrayList<Hero> heroes_list = new ArrayList<Hero>();

    public static void createNewHero(){
        Interface_Manager.showHeader("CRIAR NOVO HERÓI");

        System.out.println("Nome do herói:");
        String hero_name = System_Manager.getScan().nextLine();

        System.out.println("Classe do herói: [ELFO, BARBARO, ALQUIMISTA, MAGO, MONARCA]");
        String hero_class = System_Manager.getScan().nextLine();

        for(Hero hero : heroes_list){
            if(hero.getHero_name().equals(hero_name.trim())){
                System.out.println("Esse nome já existe.");
                return;
            }
        }

        try {
            heroes_list.add(new Hero(hero_name.trim(), Class.valueOf(hero_class)));
        }catch(IllegalArgumentException e){
            System.out.println("A classe \"" + hero_class + "\" não existe.");
        }
        System.out.println("Herói " + hero_name.trim() + " criado com sucesso.");
    }

    public static void deleteHero(){
        Interface_Manager.showHeader("DELETAR HERÓI");

        System.out.println("Nome do herói:");
        String hero_name = System_Manager.getScan().nextLine();

        Hero hero_object = null;

        for(Hero hero : heroes_list){
            if(hero.getHero_name().equals(hero_name.trim())){
                hero_object = hero;
            }
        }
        if(hero_object == null){
            System.out.println("Herói inválido.");
            return;
        }

        heroes_list.remove(hero_object);
        System.out.println("Herói " + hero_name.trim() + " deletado com sucesso.");
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
        String old_hero_name = System_Manager.getScan().nextLine();

        System.out.println("Novo nome do herói:");
        String new_hero_name = System_Manager.getScan().nextLine();

        Hero hero_obj = null;

        for(Hero hero : heroes_list){
            if(hero.getHero_name().equals(old_hero_name.trim())){
                hero_obj = hero;
            }
        }
        if(hero_obj == null){
            System.out.println("Herói inválido.");
            return;
        }

        if(old_hero_name.trim().equals(new_hero_name.trim())){
            System.out.println("O nome antigo e o nome novo são iguais.");
            return;
        }

        hero_obj.setHero_name(new_hero_name);
        System.out.println("Herói " + old_hero_name.trim() + " renomeado com sucesso para " + new_hero_name.trim());
    }
}
