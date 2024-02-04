package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    public static final int MAX_VALUE = 100;
    public static final int MIN_COUNT_OF_OPERATION = 0;
    private static final char[] OPERATORS = {'+', '-', '*'};
    public static void begin() {
        String question = ("What is the result of the expression?");
        String[][] roundData = new String[Engine.ROUNDS_COUNT][];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundData[i] = generateRound();
        }
        Engine.playRounds(roundData, question);
    }

    private static String[] generateRound() {
        String[] roundData = new String[Engine.ELEMENTS_COUNT];
        int firstNumber = Utils.generateRandomNumber(MAX_VALUE);
        int secondNumber = Utils.generateRandomNumber(MAX_VALUE);
        final int maxCountOfOperation = OPERATORS.length - 1;
        char operator = OPERATORS[Utils.generateRandomNumber(MIN_COUNT_OF_OPERATION, maxCountOfOperation)];
        roundData[1] = calculate(firstNumber, secondNumber, operator);
        roundData[0] = firstNumber + " " + operator + " " + secondNumber;
        return roundData;
    }

    private static String calculate(int firstNumber, int secondNumber, char operator) {
        return switch (operator) {
            case '+' -> Integer.toString(firstNumber + secondNumber);
            case '-' -> Integer.toString(firstNumber - secondNumber);
            case '*' -> Integer.toString(firstNumber * secondNumber);
            default -> throw new RuntimeException("Error");
        };
    }
}
