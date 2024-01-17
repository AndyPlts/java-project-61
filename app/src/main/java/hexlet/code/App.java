package hexlet.code;

import hexlet.code.games.GCD;
import hexlet.code.games.Calculator;
import hexlet.code.games.IsEven;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    public static int number;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calculator\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        number = scanner.nextInt();

        switch (number) {
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
            case 3:
                Calculator.beginCalc();
                break;
            // GCD
            case 4:
                GCD.beginGCD();
                break;
            // Progression
            case 5:
                Progression.beginProgression();
                break;
            // Prime
            case 6:
                Prime.beginPrime();
                break;
            default:
                System.out.println("Bye");
                break;
        }
    }
}
