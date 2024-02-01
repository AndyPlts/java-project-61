package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class IsEven {

    public static void beginIsEven() {
        String question = "Answer 'yes' if the number is even, "
                + "otherwise answer 'no'.";
        String[][] roundData = new String[Engine.NUMBER_OF_ROUNDS][];
        for (var i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            roundData[i] = generateRound();
        }
        Engine.rules(roundData, question);
    }

    private static String[] generateRound() {
        String[] roundData = new String[Engine.NUMBER_OF_ELEMENTS];
        final int maxValue = 1000;
        var checkedNumber = Utils.getRandomNumber(maxValue);
        roundData[0] = Integer.toString(checkedNumber);
        roundData[1] = isEven(checkedNumber) ? "yes" : "no";
        return roundData;
    }

    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }
}
