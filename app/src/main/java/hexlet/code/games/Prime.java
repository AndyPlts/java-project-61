package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static void beginPrime() {
        String question = ("Answer 'yes' if given number is prime. "
                + "Otherwise answer 'no'.");
        // Созданеи 2-мерного массива для хранения результатов генерации числа и правильного ответа
        String[][] array = new String[Engine.NUMBEROFROUNDS][];
        // Определение минимального числа и максимального числа для диапазона чисел, использумых в игре
        for (var i = 0; i < Engine.NUMBEROFROUNDS; i++) {
            array[i] = generateRound();
        }    
        Engine.playing(array, question);
    }

    private static String[] generateRound() {
        String[] array = new String[Engine.NUMBEROFELEMENTS];
        int number;
        // Определение "простоты" числа
        number = Utils.getRandomNumber();
        array[0] = Integer.toString(number);
        array[1] = isPrime(number) ? "no" : "yes";
        return array;
    }

    private static boolean isPrime(int number) {
        if (number > 1) {
            for (var i = 2; i <= number; i++) {
                if (i < number && number % i == 0) {
                    return true;
                }
            }
        }
    return false;
    }
}
