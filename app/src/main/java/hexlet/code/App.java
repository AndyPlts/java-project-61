package hexlet.code;

import hexlet.code.games.GCD;
import hexlet.code.games.Calculator;
import hexlet.code.games.IsEven;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {

    public static void main(String[] args) {
        final int numberOfEven = 2;
        final int numberOfCalculator = 3;
        final int numberOfGCD = 4;
        final int numberOfProgression = 5;
        final int numberOfPrime = 6;
        switch (Engine.chooseGame()) {
            // Greet
            case 1:
                Cli.greeting();
                break;
            // Even
            case numberOfEven:
                IsEven.beginIsEven();
                break;
            // Calculator
            case numberOfCalculator:
                Calculator.beginCalc();
                break;
            // GCD
            case numberOfGCD:
                GCD.beginGCD();
                break;
            // Progression
            case numberOfProgression:
                Progression.logicProgression();
                break;
            // Prime
            case numberOfPrime:
                Prime.beginPrime();
            default:
        }
    }
}
