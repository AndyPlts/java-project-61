package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int NUMBER_OF_ROUNDS = 3;
    public static final int NUMBER_OF_ELEMENTS = 2;

    public static void rules(String[][] roundData, String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(question);
        final int numberOfQuestions = 3;
        for (var i = 0; i < numberOfQuestions; i++) {
            System.out.println("Question: " + roundData[i][0]);
            System.out.print("Your answer: ");
            String answerOfPlayer = scanner.next();
            if (answerOfPlayer.equals(roundData[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answerOfPlayer + "' is wrong answer "
                        + ";(. Correct answer '" + roundData[i][1] + "'");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
