import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionProgram {

    // Checked Exception Program
    public static void checkedExceptionExample() {

        String filePath = "D:\\myfile.txt";
        File file = new File(filePath);

        try {

            if (!file.exists()) {
                throw new FileNotFoundException("File not found.");
            }

            if (!file.canRead()) {
                throw new IOException("File is not readable.");
            }

            Scanner fileReader = new Scanner(file);

            System.out.println("\nFile Content:");

            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }

            fileReader.close();

        } catch (FileNotFoundException e) {

            System.out.println("FileNotFoundException occurred.");
            System.out.println("The file does not exist in the given path.");

        } catch (IOException e) {

            System.out.println("IOException occurred.");
            System.out.println("The file is not readable.");

        }
    }


    // Unchecked Exception Program
    public static void uncheckedExceptionExample() {

        int num1 = 12;
        int num2;

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("\nEnter num2: ");

            num2 = input.nextInt();

            int result = num1 / num2;

            System.out.println(
                "The result after dividing " + num1 +
                " by " + num2 +
                " is " + result +
                ". No exception occurred."
            );

        } catch (ArithmeticException e) {

            System.out.println(
                "java.lang.ArithmeticException: / by zero exception occurred. " +
                "You cannot divide a number by zero."
            );

        } catch (java.util.InputMismatchException e) {

            System.out.println(
                "java.util.InputMismatchException exception occurred. " +
                "You cannot enter invalid input types. Please enter an integer value."
            );
        }
    }


    // Main Method
    public static void main(String[] args) {

        System.out.println("===== Checked Exception =====");
        checkedExceptionExample();

        System.out.println("\n===== Unchecked Exception =====");
        uncheckedExceptionExample();
    }
}