package hexlet.code;

import java.util.Scanner;

public class Game {
    public static void beginIsEven() {
        Engine.greet();
        System.out.println("Answer 'yes' if the number is even,"
                + "otherwise answer 'no'.");
        // Установка интервала чисел, используемых в игре, через максимальное и минимальное числа
        Engine.playing();
    }

    public static void logicIsEven() {
        Scanner scanner = new Scanner(System.in);
        int minValue = 1;
        int maxValue = 1000;
        int number = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        String answer = scanner.next();
        if ((number % 2 == 0) && (answer.equals("yes"))) {
            System.out.println("Correct!");
            Engine.counter++;
        } else if ((number % 2 != 0) && (answer.equals("no"))) {
            System.out.println("Correct!");
            Engine.counter++;
        } else if (number % 2 == 0) {
            System.out.println("'" + answer + "' is wrong answer "
                    + ";(. Correct answer 'yes'");
            System.out.println("Let's try again, " + Engine.name);
            Engine.counter = 0;
        } else {
            System.out.println("'" + answer + "' is wrong answer "
                    + ";(. Correct answer 'no'");
            System.out.println("Let's try again, " + Engine.name);
            Engine.counter = 0;
        }
    }
}
