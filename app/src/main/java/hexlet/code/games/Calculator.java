package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {

    public static void beginCalc() {
        //Engine.greet();
        String question = ("What is the result of the expression?");
        // Созданеи 2-мерного массива для хранения результатов генерации числа и правильного ответа
        final var sizeOfArray = 3;
        String[][] array = new String[sizeOfArray][sizeOfArray];
        for (var i = 0; i < sizeOfArray; i++) {
            generateRound(array, i);
        }
        Engine.playing(array, question);
    }

    private static void generateRound(String[][] array, int index) {
        // Определение минимального числа для диапазона чисел, использумых в игре
        final int minNumber = 0;
        // Определение максимального числа
        final int maxNumber = 100;
        final int minOperation = 1;
        final int maxOperation = 3;
        // Вывод номера операции через метод вывода случайного числа
        final int numberOfPlus = 1;
        final int numberOfMinus = 2;
        final int numberOfMultiply = 3;
        int numberOfOperation = Utils.getRandomNumber(minOperation, maxOperation);
        int firstNumber = Utils.getRandomNumber(minNumber, maxNumber);
        int secondNumber = Utils.getRandomNumber(minNumber, maxNumber);
        // 1 - сложение
        if (numberOfOperation == numberOfPlus) {
            array[index][1] = Integer.toString(firstNumber + secondNumber);
            array[index][0] = firstNumber + " + " + secondNumber;
            // 2 - вычитание
        } else if (numberOfOperation == numberOfMinus) {
            array[index][1] = Integer.toString(firstNumber - secondNumber);
            array[index][0] = firstNumber + " - " + secondNumber;
            // 3 - умножение
        } else if (numberOfOperation == numberOfMultiply) {
            array[index][1] = Integer.toString(firstNumber * secondNumber);
            array[index][0] = firstNumber + " * " + secondNumber;
        }
    }
}
