package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static void beginGCD() {
        //Engine.greet();
        String question = "Find the greatest common divisor of given numbers.";
        // Созданеи 2-мерного массива для хранения результатов генерации числа и правильного ответа
        final var sizeOfArray = 3;
        String[][] array = new String[sizeOfArray][sizeOfArray];
        // Установка диапазона чисел, задействованных в игре
        generateRound(sizeOfArray, array);
        Engine.playing(array, question);
    }

    private static void generateRound(int sizeOfArray, String[][] array) {
        final int minNumber = 1;
        final int maxNumber = 100;
        for (var i = 0; i < sizeOfArray; i++) {
            // Определение двух чисел через метод рандомных чисел и последующее определение меньшего из них
            getNumbers(minNumber, maxNumber, array[i]);
        }
    }

    private static void getNumbers(int minNumber, int maxNumber, String[] array) {
        int firstNumber = Utils.getRandomNumber(minNumber, maxNumber);
        int secondNumber = Utils.getRandomNumber(minNumber, maxNumber);
        int smallNumber = Math.min(firstNumber, secondNumber);
        for (var j = 1; j <= smallNumber; j++) {
            if (firstNumber % j == 0 && secondNumber % j == 0) {
                array[1] = Integer.toString(j);
                array[0] = firstNumber + " " + secondNumber;
            }
        }
    }
}

