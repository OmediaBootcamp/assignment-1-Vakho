package dev.omedia;

public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if(firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }
        int firstNumber1 = firstNumber / 10;
        int firstNumber2 = firstNumber % 10;

        int secondNumber1 = secondNumber / 10;
        int secondNumber2 = secondNumber % 10;

        boolean firstStatement = firstNumber1 == secondNumber1 || firstNumber1 == secondNumber2;
        boolean secondStatement = firstNumber2 == secondNumber1 || firstNumber2 == secondNumber2;

        return firstStatement || secondStatement;
    }
}
