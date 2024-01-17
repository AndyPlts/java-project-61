package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.IsEven;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Engine {

    private static String name;
    private static int counter;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Engine.name = name;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Engine.counter = counter;
    }

    public static void greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        setName(scanner.next());
        System.out.println("Hello, " + getName() + "!");
    }

    public static void playing() {
        // Счётчик побед в играх, использующий номер игры из класса "App" для запуска нужной игры
        while (getCounter() != 3) {
            switch (App.getNumber()) {
                // Even
                case 2:
                    IsEven.logicIsEven();
                    break;
                // Calculator
                case 3:
                    Calculator.logicCalc();
                    break;
                // GCD
                case 4:
                    GCD.logicGCD();
                    break;
                // Progression
                case 5:
                    Progression.logicProgression();
                    break;
                // Prime
                case 6:
                    Prime.logicPrime();
                    break;
                default:
                    break;
            }
        }
        System.out.println("Congratulations, " + getName() + "!");
    }

    public static void positiveAnswer() {
        System.out.println("Correct!");
        Engine.setCounter(Engine.getCounter() + 1);
    }

    public static void negativeAnswer(String answer, String answerOfPlayer) {
        System.out.println("'" + answerOfPlayer + "' is wrong answer "
                + ";(. Correct answer '" + answer + "'");
        System.out.println("Let's try again, " + getName() + "!");
        Runtime.getRuntime().exit(0);
    }

    public static void negativeAnswer(int answer, int answerOfPlayer) {
        System.out.println("'" + answerOfPlayer + "' is wrong answer "
                + ";(. Correct answer '" + answer + "'");
        System.out.println("Let's try again, " + getName() + "!");
        Runtime.getRuntime().exit(0);
    }

    public static int getRandomNumber(int minNumber, int maxNumber) {
        return minNumber + (int) (Math.random() * (maxNumber - minNumber + 1));
    }
}
