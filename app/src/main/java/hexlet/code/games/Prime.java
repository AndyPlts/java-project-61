package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static final int MAX_VALUE = 100;

    public static void begin() {
        String question = ("Answer 'yes' if given number is prime. "
                + "Otherwise answer 'no'.");
        String[][] roundData = new String[Engine.ROUNDS_COUNT][];
        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            roundData[i] = generateRound();
        }
        Engine.playRounds(roundData, question);
    }

    private static String[] generateRound() {
        String[] roundData = new String[Engine.ELEMENTS_COUNT];
        int checkedNumber = Utils.generateRandomNumber(MAX_VALUE);
        roundData[0] = Integer.toString(checkedNumber);
        roundData[1] = isPrime(checkedNumber) ? "no" : "yes";
        return roundData;
    }

    private static boolean isPrime(int checkedNumber) {
        if (checkedNumber > 1) {
            for (var i = 2; i <= checkedNumber; i++) {
                if (i < checkedNumber && checkedNumber % i == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
