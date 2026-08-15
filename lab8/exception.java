 import java.util.Scanner;

public class exception {

    void calculate(int input1, int input2) throws ArithmeticException, ArrayIndexOutOfBoundsException {
        int[] arr = {1, 2, 3, 4, 5};
        int i = input1 / input2;
        System.out.println("Value at index " + i + " is " + arr[i]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        exception obj = new exception();

        System.out.print("Enter input1: ");
        int input1 = scanner.nextInt();
        System.out.print("Enter input2: ");
        int input2 = scanner.nextInt();

        try {
            obj.calculate(input1, input2);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }
        scanner.close();
    }
}

