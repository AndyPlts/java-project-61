package hexlet.code;

import hexlet.code.games.GCD;
import hexlet.code.games.Calculator;
import hexlet.code.games.IsEven;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    private static int number;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calculator\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        setNumber(scanner.nextInt());
        final int numberOfCalculator = 3;
        final int numberOfGCD = 4;
        final int numberOfProgression = 5;
        final int numberOfPrime = 6;

        switch (getNumber()) {
            // Exit
            case 0:
                System.out.println("Bye.");
                break;
            // Greet
            case 1:
                Cli.greeting();
                break;
            // Even
            case 2:
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
                Progression.beginProgression();
                break;
            // Prime
            case numberOfPrime:
                Prime.beginPrime();
                break;
            default:
                System.out.println("Bye");
                break;
        }
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int numb) {
        App.number = numb;
    }
}
