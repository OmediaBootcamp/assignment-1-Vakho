package dev.omedia;

public class EvenDigitSum {
    public static int getEvenDigitSum (int number){
        if(number < 0){
            return -1;
        }

        int temp = 0;
        int sum = 0;
        while(number > 10){
            int lastDigit = number % 10;
            if(lastDigit % 2 == 0){
                sum+=lastDigit;
            }
            number /=10;
        }

        if(number % 2 == 0){
            sum += number;
        }

        return sum;
    }
}