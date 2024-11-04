package dev.omedia;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double param1 , double param2){
        long param1Round = (long) (param1 * 1000);
        long param2Round = (long) (param2 * 1000);
        return param1Round == param2Round;
    }
}