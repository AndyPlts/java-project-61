package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class IsEven {

    public static void beginIsEven() {
        String question = "Answer 'yes' if the number is even, "
                + "otherwise answer 'no'.";
        // Создание 2-мерного массива для хранения результатов генерации числа и правильного ответа
        String[][] array = new String[Engine.NUMBEROFROUNDS][];
        // Задание минимального и максимального чисел для диапазона чисел, использумых в игре
        for (var i = 0; i < Engine.NUMBEROFROUNDS; i++) {
            array[i] = generateRound();
        }
        Engine.playing(array, question);
    }

    private static String[] generateRound() {
        String[] array = new String[Engine.NUMBEROFELEMENTS];
        var tempNumber = 0;
        final int maxValue = 1000;
        tempNumber = Utils.getRandomNumber(maxValue);
        array[0] = Integer.toString(tempNumber);
        array[1] = isEven(tempNumber) ? "yes" : "no";
        return array;
    }

    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }
}
