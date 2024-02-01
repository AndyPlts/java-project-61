package hexlet.code;

import hexlet.code.games.GCD;
import hexlet.code.games.Calculator;
import hexlet.code.games.IsEven;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        final int numberOfEven = 2;
        final int numberOfCalculator = 3;
        final int numberOfGCD = 4;
        final int numberOfProgression = 5;
        final int numberOfPrime = 6;
        switch (chooseGame()) {
            case 1 -> Cli.greeting();
            case numberOfEven -> IsEven.beginIsEven();
            case numberOfCalculator -> Calculator.beginCalc();
            case numberOfGCD -> GCD.beginGCD();
            case numberOfProgression -> Progression.logicProgression();
            case numberOfPrime -> Prime.beginPrime();
            default -> throw new Error("Error");
        }
    }

    public static int chooseGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calculator\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        return scanner.nextInt();
    }
}
