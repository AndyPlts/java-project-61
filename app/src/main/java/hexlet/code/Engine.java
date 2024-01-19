package hexlet.code;

//import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.IsEven;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Arrays;
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

    public static void playing(String[][] array) {
        Scanner scanner = new Scanner(System.in);
        final int numberOfQuestions = 3;
        for (var i = 0; i < numberOfQuestions; i++) {
            System.out.println("Question: " + array[i][0]);
            System.out.print("Your answer: ");
            String answerOfPlayer = scanner.next();
            if (answerOfPlayer.equals(array[i][1])) {
                positiveAnswer();
            } else {
                negativeAnswer(array[i][1], answerOfPlayer);
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

    public static int getRandomNumber(int minNumber, int maxNumber) {
        return minNumber + (int) (Math.random() * (maxNumber - minNumber + 1));
    }
}
