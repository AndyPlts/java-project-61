package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {

    public static void beginGCD() {
        Engine.greet();
        System.out.println("Find the greatest common divisor of given numbers.");
        Engine.playing();
    }

    public static void logicGCD() {
        Scanner scanner = new Scanner(System.in);
        // Установка диапазона чисел, задействованных в игре
        final int minNumber = 1;
        final int maxNumber = 100;
        int result = 0;
        // Определение двух чисел через метод рандомных чисел и последующее определение меньшего из них
        int firstNumber = Engine.getRandomNumber(minNumber, maxNumber);
        int secondNumber = Engine.getRandomNumber(minNumber, maxNumber);
        int smallNumber = Math.min(firstNumber, secondNumber);
        // Определение наибольшего делителя путём перебирания всех чисел до наименьшего из двух выбранных
        for (var i = 1; i <= smallNumber; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                result = i;
            }
        }
        // Запрос ответа у игрока
        System.out.println("Question: " + firstNumber + " " + secondNumber);
        System.out.print("Your answer: ");
        int answerOfPlayer = scanner.nextInt();
        // Сравнение эталонного ответа и ответа игрока
        if (result == answerOfPlayer) {
            Engine.positiveAnswer();
        } else {
            Engine.negativeAnswerInt(result, answerOfPlayer);
        }
    }
}
