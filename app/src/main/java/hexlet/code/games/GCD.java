package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    public static final int MAX_VALUE = 100;
    public static final int MIN_VALUE = 1;
    public static void begin() {
        String question = "Find the greatest common divisor of given numbers.";
        final var sizeOfArray = 3;
        String[][] roundData = new String[sizeOfArray][];
        for (var i = 0; i < sizeOfArray; i++) {
            roundData[i] = generateRound();
        }
        Engine.playRounds(roundData, question);
    }

    private static String[] generateRound() {
        String[] roundData = new String[Engine.ELEMENTS_COUNT];
        int firstNumber = Utils.generateRandomNumber(MIN_VALUE, MAX_VALUE);
        int secondNumber = Utils.generateRandomNumber(MIN_VALUE, MAX_VALUE);
        roundData[0] = firstNumber + " " + secondNumber;
        roundData[1] = calculateGCD(firstNumber, secondNumber);
        return roundData;
    }

    private static String calculateGCD(int firstNumber, int secondNumber) {
        int smallNumber = Math.min(firstNumber, secondNumber);
        String answer = null;
        for (var j = 1; j <= smallNumber; j++) {
            if (firstNumber % j == 0 && secondNumber % j == 0) {
                answer = Integer.toString(j);
            }
        }
        return answer;
    }
}

