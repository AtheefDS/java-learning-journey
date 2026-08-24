import java.util.Scanner;

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