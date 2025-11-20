package utils;

public class InputValidator {

    public static boolean isPositiveAmount(int amount) {
        return amount > 0;
    }

    public static boolean isValidOption(int option) {
        return option >= 1 && option <= 5;
    }
}
