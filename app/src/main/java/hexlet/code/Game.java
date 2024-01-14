package hexlet.code;

import java.util.Scanner;

public class Game {
    private static int getRandomNumber(int minNumber, int maxNumber) {
        return minNumber + (int) (Math.random() * (maxNumber - minNumber + 1));
    }

    public static void beginIsEven() {
        Engine.greet();
        System.out.println("Answer 'yes' if the number is even,"
                + "otherwise answer 'no'.");
        Engine.playing();
    }
    public static void logicIsEven() {
        Scanner scanner = new Scanner(System.in);
        // Установка диапазона чисел, используемых в игре, через максимальное и минимальное числа
        int minValue = 1;
        int maxValue = 1000;
        int number = getRandomNumber(minValue, maxValue);
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        String answer = scanner.next();
        String positiveAnswer = "yes";
        String negativeAnswer = "no";
        if ((number % 2 == 0) && (answer.equals("yes"))) {
            Engine.positiveAnswer();
        } else if ((number % 2 != 0) && (answer.equals("no"))) {
            Engine.positiveAnswer();
        } else if (number % 2 == 0) {
            Engine.negativeAnswer(positiveAnswer, answer);
        } else {
            Engine.negativeAnswer(negativeAnswer, answer);
        }
    }

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
        int numberOfOperation = getRandomNumber(minOperation, maxOperation);
        int firstNumber = getRandomNumber(minNumber, maxNumber);
        int secondNumber = getRandomNumber(minNumber, maxNumber);
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

    public static void beginGCD() {
        Engine.greet();
        System.out.println("Find the greatest common divisor of given numbers");
        Engine.playing();
    }

    public static void logicGCD() {
        Scanner scanner = new Scanner(System.in);
        // Установка диапазона чисел, задействованных в игре
        int minNumber = 1;
        int maxNumber = 100;
        int result = 0;
        // Определение двух чисел через метод рандомных чисел и последующее определение меньшего из них
        int firstNumber = getRandomNumber(minNumber, maxNumber);
        int secondNumber = getRandomNumber(minNumber, maxNumber);
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
            Engine.negativeAnswer(result, answerOfPlayer);
        }
    }
}
