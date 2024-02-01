package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static void beginGCD() {
        String question = "Find the greatest common divisor of given numbers.";
        final var sizeOfArray = 3;
        String[][] roundData = new String[sizeOfArray][];
        for (var i = 0; i < sizeOfArray; i++) {
            roundData[i] = generateRound();
        }
        Engine.rules(roundData, question);
    }

    private static String[] generateRound() {
        String[] roundData = new String[Engine.NUMBER_OF_ELEMENTS];
        final int minValue = 1;
        final int maxValue = 100;
        int firstNumber = Utils.getRandomNumber(minValue, maxValue);
        int secondNumber = Utils.getRandomNumber(minValue, maxValue);
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

