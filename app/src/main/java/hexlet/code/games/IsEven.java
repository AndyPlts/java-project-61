package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class IsEven {

    public static void beginIsEven() {
        Engine.greet();
        System.out.println("Answer 'yes' if the number is even,"
                + "otherwise answer 'no'.");
        Engine.playing();
    }
    public static void logicIsEven() {
        Scanner scanner = new Scanner(System.in);
        // Установка диапазона чисел, используемых в игре, через максимальное и минимальное числа
        int minValue = 1;
        int maxValue = 1000;
        int number = Engine.getRandomNumber(minValue, maxValue);
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        String answer = scanner.next();
        String positiveAnswer = "yes";
        String negativeAnswer = "no";
        if ((number % 2 == 0) && (answer.equals("yes"))) {
            Engine.positiveAnswer();
        } else if ((number % 2 != 0) && (answer.equals("no"))) {
            Engine.positiveAnswer();
        } else if (number % 2 == 0) {
            Engine.negativeAnswer(positiveAnswer, answer);
        } else {
            Engine.negativeAnswer(negativeAnswer, answer);
        }
    }
}