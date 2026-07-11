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
