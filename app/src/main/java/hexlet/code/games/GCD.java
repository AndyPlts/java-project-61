package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static void beginGCD() {
        //Engine.greet();
        String question = "Find the greatest common divisor of given numbers.";
        // Созданеи 2-мерного массива для хранения результатов генерации числа и правильного ответа
        final var sizeOfArray = 3;
        String[][] array = new String[sizeOfArray][];
        // Установка диапазона чисел, задействованных в игре
        for (var i = 0; i < sizeOfArray; i++) {
            array[i] = generateRound();
        }
        Engine.playing(array, question);
    }

    private static String[] generateRound() {
        String[] array = new String[Engine.NUMBEROFELEMENTS];
            // Определение двух чисел через метод рандомных чисел и последующее определение меньшего из них
            getNumbers(array);
        return array;
    }

    private static void getNumbers(String[] array) {
        final int minValue = 1;
        final int maxValue = 100;
        int firstNumber = Utils.getRandomNumber(minValue, maxValue);
        int secondNumber = Utils.getRandomNumber(minValue, maxValue);
        int smallNumber = Math.min(firstNumber, secondNumber);
        for (var j = 1; j <= smallNumber; j++) {
            if (firstNumber % j == 0 && secondNumber % j == 0) {
                array[1] = Integer.toString(j);
                array[0] = firstNumber + " " + secondNumber;
            }
        }
    }
}

