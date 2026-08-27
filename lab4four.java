/*import java.util.Scanner;

class MaxMinGenerator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 10; i > 0; i--) {

            System.out.print("Enter number: ");
            int num = input.nextInt();

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);

        input.close();
    }
}

 */
/*
import java.util.Scanner;

 class StudentGrades {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int totalSubjects = 0;
        int passSubjects = 0;
        int failSubjects = 0;
        double totalMarks = 0;

        System.out.println("Enter subject marks (-1 to stop):");

        while (true) {

            System.out.print("Enter mark: ");
            double mark = input.nextDouble();

            if (mark == -1) {
                break;
            }

            totalSubjects++;
            totalMarks += mark;

            if (mark >= 50) {
                passSubjects++;
            } else {
                failSubjects++;
            }
        }

        double average = 0;

        if (totalSubjects > 0) {
            average = totalMarks / totalSubjects;
        }

        System.out.println("\nStudent Subject Results");
        System.out.println("Total Number Of Subjects: " + totalSubjects);
        System.out.println("Total Number Of Pass Subjects: " + passSubjects);
        System.out.println("Total Number Of Fail Subjects: " + failSubjects);
        System.out.println("Average Marks for Subjects: " + average);

        input.close();
    }
}

 */

import java.util.Scanner;
class ArrayExample {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) {
        int[] myIntArray = getIntegers(5);
        printArray(myIntArray);
    }
    public static int[] getIntegers(int number) {
        System.out.println("Please Enter " + number + " integer values");
        int intArray[] = new int[number];
        for (int i = 0; i < number; i++) {
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }
    public static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
