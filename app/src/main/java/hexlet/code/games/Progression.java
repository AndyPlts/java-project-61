package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class Progression {



    public static void logicProgression() {
        Engine.greet();
        System.out.println("What number is missing in the progression?");
        // Определение минимального числа для диапазона чисел, использумых в игре,
        // а также минимального числа приращения
        final int minNumber = 1;
        // Определение максимального числа
        final int maxNumber = 20;
        // Установка максимального числа приращения
        final int maxChangeNumber = 10;
        // Созданеи 2-мерного массива для хранения результатов генерации числа и правильного ответа
        final var sizeOfArray = 3;
        String[][] array = new String[sizeOfArray][sizeOfArray];
        for (var i = 0; i < sizeOfArray; i++) {
            // Определение первого числа ряда и приращения
            int number = Engine.getRandomNumber(minNumber, maxNumber);
            int changeNumber = Engine.getRandomNumber(minNumber, maxChangeNumber);
            // Объявление массивов, в который будет занесён ряд чисел для образования ряда,
            // который в последствии будет перенесён в строковый массив для замены одного элемента
            final int numberOfElements = 10;
            int[] numbers = new int[numberOfElements];
            String[] strNumbers = new String[numberOfElements];
            // Образование ряда чисел
            createArrayOfNumbers(numbers, number, changeNumber, strNumbers);
            // Замещение одного числа пропуском
            int indexOfReplaceNumber = Engine.getRandomNumber(0, numbers.length - 1);
            array[i][1] = strNumbers[indexOfReplaceNumber];
            // Форматирование массива в требуемый формат
            array[i][0] = getString(strNumbers, indexOfReplaceNumber);
        }
        Engine.playing(array);
    }

    private static void createArrayOfNumbers(int[] numbers, int number, int changeNumber, String[] strNumbers) {
        numbers[0] = number;
        for (var i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + changeNumber;
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        strNumbers[0] = String.valueOf(numbers[0]);
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
