package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    public static void beginPrime() {
        Engine.greet();
        System.out.println("Answer 'yes' if given number is prime. "
                + "Otherwise answer 'no'.");
        // Созданеи 2-мерного массива для хранения результатов генерации числа и правильного ответа
        final var sizeOfArray = 3;
        String[][] array = new String[sizeOfArray][sizeOfArray];
        // Определение минимального числа и максимального числа для диапазона чисел, использумых в игре
        final int minValue = 1;
        final int maxValue = 100;
        int number;
        // Определение "простоты" числа
        for (var i = 0; i < sizeOfArray; i++) {
            number = Engine.getRandomNumber(minValue, maxValue);
            array[i][0] = Integer.toString(number);
            array[i][1] = isPrimeNumber(number);
        }
        Engine.playing(array);
    }

    public static String isPrimeNumber(int number) {
        String result = "no";
        if (number > 1) {
            for (var i = 2; i <= number; i++) {
                if (i < number && number % i == 0) {
                    result = "no";
                    break;
                } else {
                    result = "yes";
                }
            }
        }
        return result;
    }
}
