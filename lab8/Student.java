import java.util.Scanner;

public class Student {

    void checkEligibilty(int attendance, int marks) {
        if (attendance < 80 || marks < 40) {
            throw new RuntimeException("You are not eligible for the final examination.");
        } else {
            System.out.println("Congratulations. You are eligible for final examination");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter attendance: ");
        int attendance = scanner.nextInt();
        System.out.print("Enter mid-semester marks: ");
        int marks = scanner.nextInt();

        try {
            student.checkEligibilty(attendance, marks);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}