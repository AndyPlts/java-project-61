package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static void beginPrime() {
        String question = ("Answer 'yes' if given number is prime. "
                + "Otherwise answer 'no'.");
        String[][] roundData = new String[Engine.NUMBER_OF_ROUNDS][];
        for (var i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {
            roundData[i] = generateRound();
        }
        Engine.rules(roundData, question);
    }

    private static String[] generateRound() {
        String[] roundData = new String[Engine.NUMBER_OF_ELEMENTS];
        int checkedNumber = Utils.getRandomNumber();
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
