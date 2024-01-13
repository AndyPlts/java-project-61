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
    // Счётчик побед в играх, использующий номер игры из класса "App" для запуска нужной игры
        while (counter != 3) {
            switch (App.number) {
                case 2:
                    Game.logicIsEven();
                    break;
                case 3:
                    Game.logicCalc();
                    break;
                default:
                    break;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
