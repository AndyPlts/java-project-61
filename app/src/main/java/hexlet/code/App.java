package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n0 - Exit");
        System.out.print("Your choice: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Bye");
        }

        if (number == 1) {
            Cli.greeting();
        }

        if (number == 2) {
            Game.isEven();
        }
    }
}
