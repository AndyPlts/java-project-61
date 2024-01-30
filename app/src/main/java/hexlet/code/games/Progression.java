package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

public class Progression {



    public static void logicProgression() {
        //Engine.greet();
        String question = "What number is missing in the progression?";
        // Определение минимального числа для диапазона чисел, использумых в игре,
        // а также минимального числа приращения
        final int minNumber = 1;
        // Определение максимального числа
        final int maxNumber = 20;
        // Установка максимального числа приращения
        final int maxChangeNumber = 10;
        // Созданеи 2-мерного массива для хранения результатов генерации числа и правильного ответа
        String[][] array = new String[Engine.NUMBEROFROUNDS][];
        for (var i = 0; i < Engine.NUMBEROFROUNDS; i++) {
            // Определение первого числа ряда и приращения
            array[i] = generateRound(minNumber, maxNumber, maxChangeNumber);
        }
        Engine.playing(array, question);
    }

    private static String[] generateRound(int minNumber, int maxNumber, int maxChangeNumber) {
        String[] array = new String[Engine.NUMBEROFELEMENTS];
        int number = Utils.getRandomNumber(minNumber, maxNumber);
        int changeNumber = Utils.getRandomNumber(minNumber, maxChangeNumber);
        final int numberOfElements = 10;
        // Образование ряда чисел
        String[] strNumbers = createArrayOfNumbers(number, changeNumber, numberOfElements);
        // Замещение одного числа пропуском
        int indexOfReplaceNumber = Utils.getRandomNumber(0, numberOfElements - 1);
        array[1] = strNumbers[indexOfReplaceNumber];
        // Форматирование массива в требуемый формат
        array[0] = getString(strNumbers, indexOfReplaceNumber);
        return array;
    }

    private static String[] createArrayOfNumbers(int number, int changeNumber, int numberOfElements) {
        int[] numbers = new int[numberOfElements];
        String[] strNumbers = new String[numberOfElements];
        numbers[0] = number;
        for (var i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + changeNumber;
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        strNumbers[0] = String.valueOf(numbers[0]);
        return strNumbers;
    }

    private static String getString(String[] strNumbers, int indexOfReplaceNumber) {
        strNumbers[indexOfReplaceNumber] = "..";
        String strOfNumbers = Arrays.toString(strNumbers);
        strOfNumbers = strOfNumbers.replace("[", "");
        strOfNumbers = strOfNumbers.replace("]", "");
        strOfNumbers = strOfNumbers.replace(",", "");
        return strOfNumbers;
    }
}
