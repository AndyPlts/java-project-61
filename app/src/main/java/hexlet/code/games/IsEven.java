package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class IsEven {

    public static final int MAX_VALUE = 1000;

    public static void begin() {
        String question = "Answer 'yes' if the number is even, "
                + "otherwise answer 'no'.";
        String[][] roundData = new String[Engine.ROUNDS_COUNT][];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundData[i] = generateRound();
        }
        Engine.playRounds(roundData, question);
    }

    private static String[] generateRound() {
        String[] roundData = new String[Engine.ELEMENTS_COUNT];
        var checkedNumber = Utils.generateRandomNumber(MAX_VALUE);
        roundData[0] = Integer.toString(checkedNumber);
        roundData[1] = isEven(checkedNumber) ? "yes" : "no";
        return roundData;
    }

    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }
}
