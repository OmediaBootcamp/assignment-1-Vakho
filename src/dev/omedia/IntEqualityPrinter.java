package dev.omedia;

public class IntEqualityPrinter {
    public static void printEqual(int param1, int param2, int param3){
        if(param1 < 0 || param2 < 0 || param3 < 0){
            System.out.println("Invalid Value");
            return;
        }else if(param1 == param2 && param2 == param3){
            System.out.println("All numbers are equal");
            return;
        }else if((param1 == param2) || (param1 == param3) || (param2 == param3)){
            System.out.println("Neither all are equal or different");
            return;
        }
        System.out.println("All numbers are different");
    }
}