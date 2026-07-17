package pkgA;

import java.util.Scanner;

public class Calculator {

    double average;
    int range;

    public void getUserInputs() {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Enter 5 integers:");

        for (int i = 1; i <= 5; i++) {

            int num = sc.nextInt();

            sum += num;

            if (num > max)
                max = num;

            if (num < min)
                min = num;
        }

        average = sum / 5.0;
        range = max - min;
    }

    public void displayValues() {

        System.out.println("Average = " + average);
        System.out.println("Range = " + range);
    }
}
