package The_Heros_Adventure.Managers;

import java.util.Scanner;

public class System_Manager {
    private static Scanner scan = new Scanner(System.in);
    private static boolean system_open = true;

    public static void exitSystem() {
        system_open = false;
    }

    public static boolean isSystem_open() {
        return system_open;
    }

    public static Scanner getScan() {
        return scan;
    }
}
