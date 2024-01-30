package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    private static final char[] OPERATORS = {'+', '-', '*'};
    public static void beginCalc() {
        //Engine.greet();
        String question = ("What is the result of the expression?");
        // Созданеи 2-мерного массива для хранения результатов генерации числа и правильного ответа
        String[][] array = new String[Engine.NUMBEROFROUNDS][];
        for (var i = 0; i < Engine.NUMBEROFROUNDS; i++) {
            array[i] = generateRound();
        }
        Engine.playing(array, question);
    }

    private static String[] generateRound() {
        String[] array = new String[Engine.NUMBEROFELEMENTS];
        // Определение максимального числа
        int firstNumber = Utils.getRandomNumber();
        int secondNumber = Utils.getRandomNumber();
        final int minOperation = 0;
        final int maxOperation = 2;
        // Определение операции через вывод символа из константы путём случайного выбора индекса
        char operator = OPERATORS[Utils.getRandomNumber(minOperation, maxOperation)];
        array[1] = count(firstNumber, secondNumber, operator);
        array[0] = firstNumber + " " + operator + " " + secondNumber;
        return array;
    }

    private static String count(int firstNumber, int secondNumber, char operator) {
        return switch (operator) {
            case '+' -> Integer.toString(firstNumber + secondNumber);
            case '-' -> Integer.toString(firstNumber - secondNumber);
            case '*' -> Integer.toString(firstNumber * secondNumber);
            default -> throw new Error("Error");
        };
    }
}
