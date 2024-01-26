package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    private static final char[] OPERATORS = {'+', '-', '*'};
    public static void beginCalc() {
        //Engine.greet();
        String question = ("What is the result of the expression?");
        // Созданеи 2-мерного массива для хранения результатов генерации числа и правильного ответа
        final var sizeOfArray = 3;
        String[][] array = new String[sizeOfArray][sizeOfArray];
        for (var i = 0; i < sizeOfArray; i++) {
            generateRound(array[i]);
        }
        Engine.playing(array, question);
    }

    private static void generateRound(String[] array) {
        // Определение минимального числа для диапазона чисел, использумых в игре
        final int minNumber = 0;
        // Определение максимального числа
        final int maxNumber = 100;
        int firstNumber = Utils.getRandomNumber(minNumber, maxNumber);
        int secondNumber = Utils.getRandomNumber(minNumber, maxNumber);
        final int minOperation = 0;
        final int maxOperation = 2;
        // Определение операции через вывод символа из константы путём случайного выбора индекса
        char operator = OPERATORS[Utils.getRandomNumber(minOperation, maxOperation)];
        array[1] = count(firstNumber, secondNumber, operator);
        array[0] = firstNumber + " " + operator + " " + secondNumber;
    }

    private static String count(int firstNumber, int secondNumber, char operator) {
        if (operator == '+') {
            return Integer.toString(firstNumber + secondNumber);
        } else if (operator == '-') {
            return Integer.toString(firstNumber - secondNumber);
        } else {
            return Integer.toString(firstNumber * secondNumber);
        }
    }
}
