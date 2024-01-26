package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void playing(String[][] array, String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(question);
        final int numberOfQuestions = 3;
        for (var i = 0; i < numberOfQuestions; i++) {
            System.out.println("Question: " + array[i][0]);
            System.out.print("Your answer: ");
            String answerOfPlayer = scanner.next();
            if (answerOfPlayer.equals(array[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answerOfPlayer + "' is wrong answer "
                        + ";(. Correct answer '" + array[i][1] + "'");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
