package hexlet.code;

import java.util.Scanner;

public class Engine {
    static String name;
    static int counter;

    public static void greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }

    public static void playing() {
        while (counter != 3) {
            if (App.number == 2) {
                Game.logicIsEven();
            }
        }
    System.out.println("Congratulations, " + name + "!");
    }
}
