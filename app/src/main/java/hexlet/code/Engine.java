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
                case 4:
                    Game.logicGCD();
                    break;
                default:
                    break;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    public static void positiveAnswer() {
        System.out.println("Correct!");
        Engine.counter++;
    }

    public static void negativeAnswer(String answer, String answerOfPlayer) {
        System.out.println("'" + answerOfPlayer + "' is wrong answer "
                + ";(. Correct answer '" + answer + "'");
        System.out.println("Let's try again, " + name);
        Engine.counter = 0;
    }

    public static void negativeAnswer(int answer, int answerOfPlayer) {
        System.out.println("'" + answerOfPlayer + "' is wrong answer "
                + ";(. Correct answer '" + answer + "'");
        System.out.println("Let's try again, " + name);
        Engine.counter = 0;
    }
}
