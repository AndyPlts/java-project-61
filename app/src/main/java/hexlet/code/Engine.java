package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ROUNDS_COUNT = 3;
    public static final int ELEMENTS_COUNT = 2;

    public static void playRounds(String[][] roundData, String rules) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(rules);
        for (String[] oneRoundData : roundData) {
            System.out.println("Question: " + oneRoundData[0]);
            System.out.print("Your answer: ");
            String playerAnswer = scanner.next();
            if (playerAnswer.equals(oneRoundData[1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + playerAnswer + "' is wrong answer "
                        + ";(. Correct answer '" + oneRoundData[1] + "'");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
