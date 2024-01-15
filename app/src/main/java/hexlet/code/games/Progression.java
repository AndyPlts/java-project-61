package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Scanner;

public class Progression {

    public static void beginProgression() {
        Engine.greet();
        System.out.println("What number is missing in this Progression?");
        Engine.playing();
    }

    public static void logicProgression() {
        // Установка диапазона чисел, из которого будет выбираться первое число ряда
        int minNumber = 1;
        int maxNumber = 20;
        // Установка максимального числа приращения
        int maxChangeNumber = 10;
        // Определение первого числа ряда и приращения
        int number = Engine.getRandomNumber(minNumber, maxNumber);
        int changeNumber = Engine.getRandomNumber(minNumber, maxChangeNumber);
        Scanner scanner = new Scanner(System.in);
        // Объявление массивов, в который будет занесён ряд чисел для образования ряда,
        // который в последствии будет перенесён в строковый массив для замены одного элемента
        int[] numbers = new int[10];
        String[] strNumbers = new String[10];
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
        strNumbers[indexOfReplaceNumber] = "..";
        // Запрос ответа у игрока
        String strOfNumbers = Arrays.toString(strNumbers);
        strOfNumbers = strOfNumbers.replace("[", "");
        strOfNumbers = strOfNumbers.replace("]", "");
        System.out.println("Question: " + strOfNumbers);
        System.out.print("Your answer: ");
        String answerOfPlayer = scanner.next();
        // Сравнение эталонного ответа и ответа игрока
        if (result.equals(answerOfPlayer)) {
            Engine.positiveAnswer();
        } else {
            Engine.negativeAnswer(result, answerOfPlayer);
        }

    }
}
