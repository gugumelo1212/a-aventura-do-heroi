package The_Heros_Adventure.Managers;

public class Interface_Manager {
    public static void showMenuInterface(){
        System.out.println("---------------");
        System.out.println("\uD83D\uDFE6 Escolha sua escolha!");
        System.out.println("[ 0 ] Criar novo herói");
        System.out.println("[ 1 ] Delete herói");
        System.out.println("[ 2 ] Mostrar meus heróis");
        System.out.println("[ 3 ] Renomear herói");
        System.out.println("[ 4 ] Sair do sistema");
        System.out.println("---------------");
    }
    public static void showHeader(String text){
        System.out.println("-----[ " + text + " ]-----");
    }
}
