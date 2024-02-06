package hexlet.code;

public class Utils {
    public static int generateRandomNumber(int minNumber, int maxNumber) {
        return minNumber + (int) (Math.random() * (maxNumber - minNumber + 1));
    }

    public static int generateRandomNumber(int maxNumber) {
        return generateRandomNumber(0, maxNumber);
    }

}
