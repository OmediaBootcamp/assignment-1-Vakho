package dev.omedia;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 20. Primitive types challenge
        byte myByte = 5;
        short myShort = 1000;
        int myInt = 22500;
        long myLong = 50000L;
        myLong += 10 * (myByte + myShort + myInt);

        // 22. Floating Point Precision and a Challenge
        double inputInPounds = 23.4d;
        double outputInKilograms = inputInPounds * 0.45359237d;

        //39. Operator Precedence and Operator Challenge
        double double1 = 20.00d;
        double double2 =  80.00d;
        double result = (double1 + double2) * 100.00d;
        double reminder = result % 40;
        boolean hasReminder = reminder == 0 ? false : true;

        if (hasReminder) {
            System.out.println("Has reminder");
        }else{
            System.out.println("Has not reminder");
        }

        //44. if-else challenge
        boolean gameOver = true;
        int score = 800;
        int leverCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if(gameOver){
            finalScore += (leverCompleted * bonus);
            System.out.println("Final score is " + finalScore);
        }

        score = 10000;
        leverCompleted = 8;
        bonus = 200;

        if(gameOver){
            finalScore += (leverCompleted * bonus);
            System.out.println("Final score is " + finalScore);
        }
    }


    //48. Method Challenge
    public int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        }else if(playerScore >= 500){
            return 2;
        }else if (playerScore >= 100){
            return 3;
        }
        return 4;
    }

    //52. Method Overloading Challenge
    public double convertToCentimeters(int heightInInches){
         return heightInInches * 2.54;
    }

    public double convertToCentimeters(int feet, int inches){
        return ((feet * 12) + inches) * 2.54;
    }
}