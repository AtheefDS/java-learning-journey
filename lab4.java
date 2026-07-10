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
