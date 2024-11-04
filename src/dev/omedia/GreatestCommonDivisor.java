package dev.omedia;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10) {
            return -1;
        }
        int minValue = first < second ? first : second;
        int greatestCommonDivisor = 1;
        for(int i=1; i<=minValue; i++) {
            if(first % i == 0 && second % i == 0) {
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;
    }
}
