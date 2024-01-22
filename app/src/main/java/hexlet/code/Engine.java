package hexlet.code;

//import hexlet.code.games.Calculator;

import java.util.Scanner;

public class Engine {

    private static String name;

    public static String getName() {
        return name;
    }

    public static void setName(String nam) {
        Engine.name = nam;
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
                getPositiveAnswer();
            } else {
                getNegativeAnswer(array[i][1], answerOfPlayer);
            }
        }
        System.out.println("Congratulations, " + getName() + "!");
    }

    public static void getPositiveAnswer() {
        System.out.println("Correct!");
    }

    public static void getNegativeAnswer(String answer, String answerOfPlayer) {
        System.out.println("'" + answerOfPlayer + "' is wrong answer "
                + ";(. Correct answer '" + answer + "'");
        System.out.println("Let's try again, " + getName() + "!");
        Runtime.getRuntime().exit(0);

    }

    public static int getRandomNumber(int minNumber, int maxNumber) {
        return minNumber + (int) (Math.random() * (maxNumber - minNumber + 1));
    }

    public static int chooseGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calculator\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        return scanner.nextInt();
    }


}
