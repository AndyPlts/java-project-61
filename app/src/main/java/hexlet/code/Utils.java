package hexlet.code;

public class Utils {
    public static int getRandomNumber(int minNumber, int maxNumber) {
        return minNumber + (int) (Math.random() * (maxNumber - minNumber + 1));
    }

    public static int getRandomNumber(int maxNumber) {
        return (int) (Math.random() * (maxNumber + 1));
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * (100 + 1));
    }
}
