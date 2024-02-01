package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

public class Progression {
    private static final int LOW_LIMIT_NUMBER = 1;
    private static final int TOP_LIMIT_NUMBER = 20;
    private static final int MAX_STEP_NUMBER = 10;
    public static void logicProgression() {
        String question = "What number is missing in the progression?";
        String[][] roundData = new String[Engine.NUMBER_OF_ROUNDS][];
        for (var i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            roundData[i] = generateRound();
        }
        Engine.rules(roundData, question);
    }

    private static String[] generateRound() {
        String[] roundData = new String[Engine.NUMBER_OF_ELEMENTS];
        int firstProgressionElement = Utils.getRandomNumber(LOW_LIMIT_NUMBER, TOP_LIMIT_NUMBER);
        int stepNumber = Utils.getRandomNumber(LOW_LIMIT_NUMBER, MAX_STEP_NUMBER);
        final int numberOfElements = 10;
        String[] progression = generateProgression(firstProgressionElement, stepNumber, numberOfElements);
        int indexOfReplacedNumber = Utils.getRandomNumber(0, numberOfElements - 1);
        roundData[1] = progression[indexOfReplacedNumber];
        roundData[0] = formatProgression(progression, indexOfReplacedNumber);
        return roundData;
    }

    private static String[] generateProgression(int number, int changeNumber, int numberOfElements) {
        String[] progression = new String[numberOfElements];
        progression[0] = String.valueOf(number);
        for (var i = 1; i < progression.length; i++) {
            progression[i] = String.valueOf(number + i * changeNumber);
        }
        return progression;
    }

    private static String formatProgression(String[] formattedProgression, int indexOfReplaceNumber) {
        formattedProgression[indexOfReplaceNumber] = "..";
        String formattedStringProgression = Arrays.toString(formattedProgression);
        formattedStringProgression = formattedStringProgression.replace("[", "");
        formattedStringProgression = formattedStringProgression.replace("]", "");
        formattedStringProgression = formattedStringProgression.replace(",", "");
        return formattedStringProgression;
    }
}
