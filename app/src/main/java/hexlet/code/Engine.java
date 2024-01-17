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

    public static void setName(String nam) {
        Engine.name = nam;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int count) {
        Engine.counter = count;
    }

    public static void greet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        setName(scanner.next());
        System.out.println("Hello, " + getName() + "!");
    }

    public static void playing() {
        final int numberOfEven = 2;
        final int numberOfCalculator = 3;
        final int numberOfGCD = 4;
        final int numberOfProgression = 5;
        final int numberOfPrime = 6;
        final int requiredNumberOfVictories = 3;
        // Счётчик побед в играх, использующий номер игры из класса "App" для запуска нужной игры
        while (getCounter() != requiredNumberOfVictories) {
            switch (App.getNumber()) {
                // Even
                case numberOfEven:
                    IsEven.logicIsEven();
                    break;
                // Calculator
                case numberOfCalculator:
                    Calculator.logicCalc();
                    break;
                // GCD
                case numberOfGCD:
                    GCD.logicGCD();
                    break;
                // Progression
                case numberOfProgression:
                    Progression.logicProgression();
                    break;
                // Prime
                case numberOfPrime:
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

    public static void negativeAnswerString(String answer, String answerOfPlayer) {
        System.out.println("'" + answerOfPlayer + "' is wrong answer "
                + ";(. Correct answer '" + answer + "'");
        System.out.println("Let's try again, " + getName() + "!");
        Runtime.getRuntime().exit(0);
    }

    public static void negativeAnswerInt(int answer, int answerOfPlayer) {
        System.out.println("'" + answerOfPlayer + "' is wrong answer "
                + ";(. Correct answer '" + answer + "'");
        System.out.println("Let's try again, " + getName() + "!");
        Runtime.getRuntime().exit(0);
    }

    public static int getRandomNumber(int minNumber, int maxNumber) {
        return minNumber + (int) (Math.random() * (maxNumber - minNumber + 1));
    }
}
