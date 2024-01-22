package hexlet.code.games;

import hexlet.code.Engine;

public class Calculator {

    public static void beginCalc() {
        Engine.greet();
        System.out.println("What is the result of the expression?");
        // Созданеи 2-мерного массива для хранения результатов генерации числа и правильного ответа
        final var sizeOfArray = 3;
        String[][] array = new String[sizeOfArray][sizeOfArray];
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
        for (var i = 0; i < sizeOfArray; i++) {
            int numberOfOperation = Engine.getRandomNumber(minOperation, maxOperation);
            int firstNumber = Engine.getRandomNumber(minNumber, maxNumber);
            int secondNumber = Engine.getRandomNumber(minNumber, maxNumber);
                // 1 - сложение
            if (numberOfOperation == numberOfPlus) {
                array[i][1] = Integer.toString(firstNumber + secondNumber);
                array[i][0] = firstNumber + " + " + secondNumber;
                // 2 - вычитание
            } else if (numberOfOperation == numberOfMinus) {
                array[i][1] = Integer.toString(firstNumber - secondNumber);
                array[i][0] = firstNumber + " - " + secondNumber;
                // 3 - умножение
            } else if (numberOfOperation == numberOfMultiply) {
                array[i][1] = Integer.toString(firstNumber * secondNumber);
                array[i][0] = firstNumber + " * " + secondNumber;
            }
        }
        Engine.playing(array);
    }
}
