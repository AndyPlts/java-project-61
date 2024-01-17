package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Calculator {
    public static void beginCalc() {
        Engine.greet();
        System.out.println("What is the result of the expression?");
        Engine.playing();
    }

    public static void logicCalc() {
        Scanner scanner = new Scanner(System.in);
        // Определение минимального числа для диапазона чисел, использумых в игре
        final int minNumber = 0;
        // Определение максимального числа
        final int maxNumber = 100;
        final int minOperation = 1;
        final int maxOperation = 3;
        int resultOfCount = 0;
        // Вывод номера операции через метод вывода случайного числа
        int numberOfOperation = Engine.getRandomNumber(minOperation, maxOperation);
        int firstNumber = Engine.getRandomNumber(minNumber, maxNumber);
        int secondNumber = Engine.getRandomNumber(minNumber, maxNumber);
        // 1 - сложение
        if (numberOfOperation == 1) {
            resultOfCount = firstNumber + secondNumber;
            System.out.println("Question: " + firstNumber + " + " + secondNumber);
        // 2 - вычитание
        } else if (numberOfOperation == 2) {
            resultOfCount = firstNumber - secondNumber;
            System.out.println("Question: " + firstNumber + " - " + secondNumber);
        // 3 - умножение
        } else if (numberOfOperation == 3) {
            resultOfCount = firstNumber * secondNumber;
            System.out.println("Question: " + firstNumber + " * " + secondNumber);
        }
        int answerOfPlayer = scanner.nextInt();
        if (resultOfCount == answerOfPlayer) {
            Engine.positiveAnswer();
        } else {
            Engine.negativeAnswer(resultOfCount, answerOfPlayer);
        }
    }
}
