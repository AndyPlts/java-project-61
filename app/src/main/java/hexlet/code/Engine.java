package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.IsEven;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

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
                    IsEven.logicIsEven();
                    break;
                case 3:
                    Calculator.logicCalc();
                    break;
                case 4:
                    GCD.logicGCD();
                    break;
                case 5:
                    Progression.logicProgression();
                    break;
                case 6:
                    Prime.logicPrime();
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
        System.out.println("Let's try again, " + name + "!");
        Runtime.getRuntime().exit(0);
    }

    public static void negativeAnswer(int answer, int answerOfPlayer) {
        System.out.println("'" + answerOfPlayer + "' is wrong answer "
                + ";(. Correct answer '" + answer + "'");
        System.out.println("Let's try again, " + name);
        Runtime.getRuntime().exit(0);
    }

    public static int getRandomNumber(int minNumber, int maxNumber) {
        return minNumber + (int) (Math.random() * (maxNumber - minNumber + 1));
    }
}
