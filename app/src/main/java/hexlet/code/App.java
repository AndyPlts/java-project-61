package hexlet.code;

import java.util.Scanner;

public class App {
    static int number;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calculator\n4 - GCD\n5 - Progression\n0 - Exit");
        System.out.print("Your choice: ");
        number = scanner.nextInt();

        switch (number) {
            case 0:
                System.out.println("Bye.");
                break;
            case 1:
                Cli.greeting();
                break;
            case 2:
                Game.beginIsEven();
                break;
            case 3:
                Game.beginCalc();
                break;
            case 4:
                Game.beginGCD();
                break;
            case 5:
                Game.beginProgression();
                break;
            default:
                System.out.println("Bye");
                break;
        }
    }
}
