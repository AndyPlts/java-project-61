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
        if ((number % 2 == 0) && (answer.equals("yes"))) {
            System.out.println("Correct!");
            Engine.counter++;
        } else if ((number % 2 != 0) && (answer.equals("no"))) {
            System.out.println("Correct!");
            Engine.counter++;
        } else if (number % 2 == 0) {
            System.out.println("'" + answer + "' is wrong answer "
                    + ";(. Correct answer 'yes'");
            System.out.println("Let's try again, " + Engine.name);
            Engine.counter = 0;
        } else {
            System.out.println("'" + answer + "' is wrong answer "
                    + ";(. Correct answer 'no'");
            System.out.println("Let's try again, " + Engine.name);
            Engine.counter = 0;
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
        int minOperation = 1;
        int maxOperation = 3;
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
            Engine.counter++;
            System.out.println("Correct!");
        } else {
            Engine.counter = 0;
            System.out.println("'" + answerOfPlayer + "' is wrong answer "
                    + ";(. Correct answer '" + resultOfCount + "'");
            System.out.println("Let's try again, " + Engine.name);
        }
    }
}
