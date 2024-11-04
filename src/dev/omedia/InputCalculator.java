package dev.omedia;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter an integer (or non-integer to end): ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }
            scanner.nextLine();
        }
        long avg = (count > 0) ? Math.round((double) sum / count) : 0;
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
