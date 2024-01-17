package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Scanner;

public class Progression {

    public static void beginProgression() {
        Engine.greet();
        System.out.println("What number is missing in the progression?");
        Engine.playing();
    }

    public static void logicProgression() {
        // Определение минимального числа для диапазона чисел, использумых в игре,
        // а также минимального числа приращения
        final int minNumber = 1;
        // Определение максимального числа
        final int maxNumber = 20;
        // Установка максимального числа приращения
        final int maxChangeNumber = 10;
        // Определение первого числа ряда и приращения
        int number = Engine.getRandomNumber(minNumber, maxNumber);
        int changeNumber = Engine.getRandomNumber(minNumber, maxChangeNumber);
        Scanner scanner = new Scanner(System.in);
        // Объявление массивов, в который будет занесён ряд чисел для образования ряда,
        // который в последствии будет перенесён в строковый массив для замены одного элемента
        final int numberOfElements = 10;
        int[] numbers = new int[numberOfElements];
        String[] strNumbers = new String[numberOfElements];
        // Образование ряда чисел
        numbers[0] = number;
        for (var i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + changeNumber;
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        strNumbers[0] = String.valueOf(numbers[0]);
        // Замещение одного числа пропуском
        int indexOfReplaceNumber = Engine.getRandomNumber(0, numbers.length - 1);
        String result = strNumbers[indexOfReplaceNumber];
        // Форматирование массива в требуемый формат
        String strOfNumbers = getString(strNumbers, indexOfReplaceNumber);
        System.out.println("Question: " + strOfNumbers);
        System.out.print("Your answer: ");
        String answerOfPlayer = scanner.next();
        // Сравнение эталонного ответа и ответа игрока
        if (result.equals(answerOfPlayer)) {
            Engine.positiveAnswer();
        } else {
            Engine.negativeAnswerString(result, answerOfPlayer);
        }
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
