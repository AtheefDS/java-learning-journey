import java.lang.System;
import java.util.Scanner;




class student {

    String getFullName(String x , String y){
    return x +" "+ y;
}


    float bmi(float x , float y){
        return x / (y*y);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your FirstName:");
        String FirstName = scan.nextLine();
        System.out.println("Enter your LastName:");
        String LastName = scan.nextLine();
        System.out.println("Enter your Weight:");
        float Weight = scan.nextFloat();
        System.out.println("Enter your Height:");
        float height = scan.nextFloat();
        //BMI calculated
        float BMI =  Weight / (height* height);
        System.out.println("Your BMI is " + BMI);

        student s = new student();

        String fullName = s.getFullName(FirstName, LastName);

        System.out.println("Full Name: " + fullName);

        float Bodymass = s.bmi(Weight , height);
        System.out.println(Bodymass);


    }
}




class Triangle {

    int a;
    int b;
    int c;

    String triangleChecker(int x, int y, int z) {
        if (x + y > z && y + z > x && z + x > y) {
            return "Yes, This is a triangle";
        } else {
            return "No, This is not a triangle";
        }
    }

    int getPerimeter() {
        if (triangleChecker(a, b, c).equals("Yes, This is a triangle")) {
            return a + b + c;
        }
        return 0;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Triangle t = new Triangle();

        t.a = scan.nextInt();
        t.b = scan.nextInt();
        t.c = scan.nextInt();

        String result = t.triangleChecker(t.a, t.b, t.c);
        System.out.println(result);

        if (t.getPerimeter() != 0) {
            System.out.println("Perimeter = " + t.getPerimeter());
        }

        scan.close();
    }
}



//Question 3


class GradeGenerator {

    // Method to display grade
    public static void checkGrade(int mark) {
        if (mark < 0 || mark > 100) {
            System.out.println("Marks should be in range 0-100");
        } else if (mark >= 75) {
            System.out.println("Grade for the subject : A");
        } else if (mark >= 65) {
            System.out.println("Grade for the subject : B");
        } else if (mark >= 55) {
            System.out.println("Grade for the subject : C");
        } else {
            System.out.println("Subject Fail");
        }
    }

    // Method to check positive numbers
    public static void checkPositive(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("X and Y are positive numbers");
        } else {
            System.out.println("X and Y are not positive numbers");
        }
    }

    // Method to check difference
    public static void checkDifference(int x, int y) {
        if ((x - y) > 0) {
            System.out.println("Difference between X and Y is a positive number");
        } else {
            System.out.println("Difference between X and Y is not a positive number");
        }
    }

    // Method to check Y range
    public static void checkRange(int y) {
        if (y >= 20 && y <= 50) {
            System.out.println("Y is between 20 and 50");
        } else {
            System.out.println("Y is not in range 20-50");
        }
    }

    // Method to check whether Y is a 3-digit number using a loop
    public static void checkThreeDigit(int y) {
        int temp = Math.abs(y);
        int count = 0;

        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                count++;
                temp = temp / 10;
            }
        }

        if (count == 3) {
            System.out.println("Y is a 3-digit number");
        } else {
            System.out.println("Y is not a 3-digit number");
        }
    }

    // Method to check odd numbers
    public static void checkOdd(int x, int y) {
        if (x % 2 != 0 && y % 2 != 0) {
            System.out.println("Both X and Y are odd numbers");
        } else {
            System.out.println("Both X and Y are not odd numbers");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Student marks
        System.out.print("Enter Student Subject Marks: ");
        int mark = scan.nextInt();

        System.out.println("Student Marks for Subject: " + mark);
        checkGrade(mark);

        // X and Y values
        System.out.print("\nEnter X value: ");
        int x = scan.nextInt();

        System.out.print("Enter Y value: ");
        int y = scan.nextInt();

        System.out.println();

        checkPositive(x, y);
        checkDifference(x, y);
        checkRange(y);
        checkThreeDigit(y);
        checkOdd(x, y);

        scan.close();
    }
}

//Question 4
class  MaxMinGenerator{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ten inputs:");
        int n = 10 ;

        int[] arr = new int[n];

         int max = arr[0];
        int min = arr[0];
        for(int i = 0 ; i<10 ; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = scan.nextInt();


             if (arr[i] > max) {
                max = arr[i];
            }

            // Check for minimum
            if (arr[i] < min) {
                min = arr[i];
            }
        }
         System.out.println("\nMaximum Number: " + max);
        System.out.println("Minimum Number: " + min);
    }
}

//question 5
class StudentGrades{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
    }
}