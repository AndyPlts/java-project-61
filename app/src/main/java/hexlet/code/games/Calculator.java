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
        // Установка диапазона чисел и количества выполняемых операций
        int minNumber = 0;
        int maxNumber = 100;
        final int minOperation = 1;
        final int maxOperation = 3;
        int resultOfCount = 0;
        // Вывод номера операции через метод вывода случайного числа
        // 1 - сложение, 2 - вычитание, 3 - умножение
        int numberOfOperation = Engine.getRandomNumber(minOperation, maxOperation);
        int firstNumber = Engine.getRandomNumber(minNumber, maxNumber);
        int secondNumber = Engine.getRandomNumber(minNumber, maxNumber);
        if (numberOfOperation == 1) {
            resultOfCount = firstNumber + secondNumber;
            System.out.println("Question: " + firstNumber + " + " + secondNumber);
        } else if (numberOfOperation == 2) {
            resultOfCount = firstNumber - secondNumber;
            System.out.println("Question: " + firstNumber + " - " + secondNumber);
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
