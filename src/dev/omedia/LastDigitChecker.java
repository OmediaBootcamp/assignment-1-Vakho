package dev.omedia;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if(!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }
        int rightmost1 = num1 % 10;
        int rightmost2 = num2 % 10;
        int rightmost3 = num3 % 10;

        return  rightmost1 == rightmost2 || rightmost2 == rightmost3 || rightmost1 == rightmost3;
    }

    public static boolean isValid(int number) {
        return (number >= 10) && (number <= 1000);
    }
}