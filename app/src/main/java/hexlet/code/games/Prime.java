package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {

    public static void beginPrime() {
        Engine.greet();
        System.out.println("Answer 'yes' if the number is Prime,"
                + "otherwise answer 'no'.");
        Engine.playing();
    }

    public static void logicPrime() {
        Scanner scanner = new Scanner(System.in);
        // Установка диапазона чисел, используемых в игре, через максимальное и минимальное числа
        int minValue = 1;
        int maxValue = 100;
        int number = Engine.getRandomNumber(minValue, maxValue);
        String result = "yes";
        // Определение "простоты" числа
        if (number > 1) {
            for (var i = 2; i <= number; i++) {
                if (i < number && number % i == 0) {
                    result = "no";
                    break;
                }
            }
        } else {
            result = "no";
        }
        // Запрос ответа у игрока и последующее сравнее его ответа с эталоном
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        String answerOfPlayer = scanner.next();
        if (result.equals(answerOfPlayer)) {
            Engine.positiveAnswer();
        } else {
            Engine.negativeAnswer(result, answerOfPlayer);
        }
    }
}