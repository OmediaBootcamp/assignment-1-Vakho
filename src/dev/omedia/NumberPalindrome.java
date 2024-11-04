package dev.omedia;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        while (originalNumber != 0) {
            int lastDigit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            originalNumber /= 10;
        }

        return reversedNumber == number;
    }
}