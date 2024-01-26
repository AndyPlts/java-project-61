package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class IsEven {

    public static void beginIsEven() {
        String question = "Answer 'yes' if the number is even, "
                + "otherwise answer 'no'.";
        // Созданеи 2-мерного массива для хранения результатов генерации числа и правильного ответа
        final var sizeOfArray = 3;
        String[][] array = new String[sizeOfArray][sizeOfArray];
        // Задание минимального и максимального чисел для диапазона чисел, использумых в игре
        for (var i = 0; i < sizeOfArray; i++) {
            generateRound(array, i);
        }
        Engine.playing(array, question);
    }

    private static void generateRound(String[][] array, int index) {
        final int minValue = 1;
        final int maxValue = 1000;
        var tempNumber = 0;
        tempNumber = Utils.getRandomNumber(minValue, maxValue);
        array[index][0] = Integer.toString(tempNumber);
        if (tempNumber % 2 == 0) {
            array[index][1] = "yes";
        } else {
            array[index][1] = "no";
        }
    }
}
