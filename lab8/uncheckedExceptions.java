import java.util.InputMismatchException;
import java.util.Scanner;

public class uncheckedExceptions {
    public static void main(String[] args) {
        int num1 = 12;
        int num2;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter num2: ");
            num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("The result after dividing 12 by " + num2 + " is " + result + ". No exception occurred.");

        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero exception occurred. You cannot divide a number by zero.");
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException exception occurred. You cannot enter invalid input types. Please enter an integer value.");
        }
        scanner.close();
    }
}