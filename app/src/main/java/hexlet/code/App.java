package hexlet.code;

import hexlet.code.games.GCD;
import hexlet.code.games.Calculator;
import hexlet.code.games.IsEven;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        final int evenGameIndex = 2;
        final int calcGameIndex = 3;
        final int gcdGameIndex = 4;
        final int progressionGameIndex = 5;
        final int primeGameIndex = 6;
        switch (chooseGame()) {
            case 1 -> Cli.greeting();
            case evenGameIndex -> IsEven.begin();
            case calcGameIndex -> Calculator.begin();
            case gcdGameIndex -> GCD.begin();
            case progressionGameIndex -> Progression.begin();
            case primeGameIndex -> Prime.begin();
            default -> throw new RuntimeException("Error");
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
