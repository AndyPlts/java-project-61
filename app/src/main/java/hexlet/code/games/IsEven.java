package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class IsEven {

    public static void beginIsEven() {
        Engine.greet();
        System.out.println("Answer 'yes' if the number is even, "
                + "otherwise answer 'no'.");
        // Созданеи 2-мерного массива для хранения результатов генерации числа и правильного ответа
        final var sizeOfArray = 3;
        String[][] array = new String[sizeOfArray][sizeOfArray];
        // Задание минимального и максимального чисел для диапазона чисел, использумых в игре
        final int minValue = 1;
        final int maxValue = 1000;
        var tempNumber = 0;
        for (var i = 0; i < sizeOfArray; i++) {
            tempNumber = Engine.getRandomNumber(minValue, maxValue);
            array[i][0] = Integer.toString(tempNumber);
            if (tempNumber % 2 == 0) {
                array[i][1] = "yes";
            } else {
                array[i][1] = "no";
            }
        }
        Engine.playing(array);
    }
}
