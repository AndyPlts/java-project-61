package hexlet.code;

import java.util.Scanner;

public class Game {

    public static void isEven() {
        int counter = 0;
        int minValue = 1;
        int maxValue = 1000;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");

        System.out.println("Answer 'yes' if the number is even,"
                + "otherwise answer 'no'.");

        while (counter != 3) {
            int number = minValue + (int) (Math.random() * (maxValue - minValue + 1));
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if ((number % 2 == 0) && (answer.equals("yes"))) {
                System.out.println("Correct");
                counter++;
            } else if ((number % 2 != 0) && (answer.equals("no"))) {
                System.out.println("Correct");
                counter++;
            } else if (number % 2 == 0) {
                System.out.println("'" + answer + "' is wrong answer "
                        + ";(. Correct answer 'yes'");
                System.out.println("Let's try again, " + name);
                counter = 0;
            } else {
                System.out.println("'" + answer + "' is wrong answer "
                        + ";(. Correct answer 'no'");
                System.out.println("Let's try again, " + name);
                counter = 0;
            }
        }

        System.out.println("Congratulations, " + name + "!");

        scanner.close();
    }
}
