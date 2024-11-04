package dev.omedia;

public class TeenNumberChecker {
    public static boolean hasTeen(int one, int two, int three){
        if(isTeen(one) || isTeen(two) || isTeen(three)){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int age){
        return age <= 19 && age >= 13;
    }
}