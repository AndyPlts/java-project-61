package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

public class Progression {
    private static final int LOW_LIMIT = 1;
    private static final int TOP_LIMIT = 20;
    private static final int MAX_PROGRESSION_STEP = 10;
    private static final int PROGRESSION_LENGTH = 10;
    public static void begin() {
        String question = "What number is missing in the progression?";
        String[][] roundData = new String[Engine.ROUNDS_COUNT][];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundData[i] = generateRound();
        }
        Engine.playRounds(roundData, question);
    }

    private static String[] generateRound() {
        String[] roundData = new String[Engine.ELEMENTS_COUNT];
        int firstProgressionElement = Utils.generateRandomNumber(LOW_LIMIT, TOP_LIMIT);
        int stepNumber = Utils.generateRandomNumber(LOW_LIMIT, MAX_PROGRESSION_STEP);
        String[] progression = generateProgression(firstProgressionElement, stepNumber, PROGRESSION_LENGTH);
        int indexOfReplacedNumber = Utils.generateRandomNumber(0, PROGRESSION_LENGTH - 1);
        roundData[1] = progression[indexOfReplacedNumber];
        roundData[0] = formatProgression(progression, indexOfReplacedNumber);
        return roundData;
    }

    private static String[] generateProgression(int firstValue, int progressionStep, int numberOfElements) {
        String[] progression = new String[numberOfElements];
        progression[0] = String.valueOf(firstValue);
        for (var i = 1; i < progression.length; i++) {
            progression[i] = String.valueOf(firstValue + i * progressionStep);
        }
        return progression;
    }

    private static String formatProgression(String[] formattedProgression, int replacingIndex) {
        formattedProgression[replacingIndex] = "..";
        String formattedStringProgression = Arrays.toString(formattedProgression);
        formattedStringProgression = formattedStringProgression.replace("[", "");
        formattedStringProgression = formattedStringProgression.replace("]", "");
        formattedStringProgression = formattedStringProgression.replace(",", "");
        return formattedStringProgression;
    }
}
