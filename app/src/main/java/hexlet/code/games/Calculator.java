package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calculator {
    private static final char[] OPERATORS = {'+', '-', '*'};
    public static void beginCalc() {
        String question = ("What is the result of the expression?");
        String[][] roundData = new String[Engine.NUMBER_OF_ROUNDS][];
        for (var i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            roundData[i] = generateRound();
        }
        Engine.rules(roundData, question);
    }

    private static String[] generateRound() {
        String[] roundData = new String[Engine.NUMBER_OF_ELEMENTS];
        int firstNumber = Utils.getRandomNumber();
        int secondNumber = Utils.getRandomNumber();
        final int minNumberOfOperation = 0;
        final int maxNumberOfOperation = OPERATORS.length - 1;
        char operator = OPERATORS[Utils.getRandomNumber(minNumberOfOperation, maxNumberOfOperation)];
        roundData[1] = calculate(firstNumber, secondNumber, operator);
        roundData[0] = firstNumber + " " + operator + " " + secondNumber;
        return roundData;
    }

    private static String calculate(int firstNumber, int secondNumber, char operator) {
        return switch (operator) {
            case '+' -> Integer.toString(firstNumber + secondNumber);
            case '-' -> Integer.toString(firstNumber - secondNumber);
            case '*' -> Integer.toString(firstNumber * secondNumber);
            default -> throw new Error("Error");
        };
    }
}
