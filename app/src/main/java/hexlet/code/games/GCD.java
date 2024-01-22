package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    public static void beginGCD() {
        Engine.greet();
        // Созданеи 2-мерного массива для хранения результатов генерации числа и правильного ответа
        final var sizeOfArray = 3;
        String[][] array = new String[sizeOfArray][sizeOfArray];
        // Установка диапазона чисел, задействованных в игре
        final int minNumber = 1;
        final int maxNumber = 100;
        // Определение наибольшего делителя путём перебирания всех чисел до наименьшего из двух выбранных
        for (var i = 0; i < sizeOfArray; i++) {
            // Определение двух чисел через метод рандомных чисел и последующее определение меньшего из них
            int firstNumber = Engine.getRandomNumber(minNumber, maxNumber);
            int secondNumber = Engine.getRandomNumber(minNumber, maxNumber);
            int smallNumber = Math.min(firstNumber, secondNumber);
            for (var j = 1; j <= smallNumber; j++) {
                if (firstNumber % j == 0 && secondNumber % j == 0) {
                    array[i][1] = Integer.toString(j);
                    array[i][0] = firstNumber + " " + secondNumber;
                }
            }
        }
        Engine.playing(array);
    }
}

