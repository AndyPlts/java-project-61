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
        final int numberOfPlus = 1;
        final int numberOfMinus = 2;
        final int numberOfMultiply = 3;
        if (numberOfOperation == numberOfPlus) {
            resultOfCount = firstNumber + secondNumber;
            System.out.println("Question: " + firstNumber + " + " + secondNumber);
            // 2 - вычитание
        } else if (numberOfOperation == numberOfMinus) {
            resultOfCount = firstNumber - secondNumber;
            System.out.println("Question: " + firstNumber + " - " + secondNumber);
            // 3 - умножение
        } else if (numberOfOperation == numberOfMultiply) {
            resultOfCount = firstNumber * secondNumber;
            System.out.println("Question: " + firstNumber + " * " + secondNumber);
        }
        int answerOfPlayer = scanner.nextInt();
        compareAnswers(resultOfCount, answerOfPlayer);
    }

    private static void compareAnswers(int resultOfCount, int answerOfPlayer) {
        if (resultOfCount == answerOfPlayer) {
            Engine.positiveAnswer();
        } else {
            Engine.negativeAnswerInt(resultOfCount, answerOfPlayer);
        }
    }
}
