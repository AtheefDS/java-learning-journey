import java.lang.System;
import java.util.Scanner;
//check the year is leap year / not leap year
public class condition {
    public static void main(String[] args) {
        Scanner e1 = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = e1.nextInt();
        if((year%4==0 && year % 100 ==0) && year%400==0){
            System.out.println(year + " is leap year");

        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }
}

// check character alphabet or not 
class alphabet{
    public static void main(String[] args) {
        Scanner q2 = new Scanner(System.in);
        System.out.println("Enter you favourite character");
        char cha = q2.next().charAt(0);
        if(cha == 'a' || cha == 'A'){
            System.out.println(cha + " is a alphabet character");
        }
        else if(cha == 'e' || cha == 'E'){
            System.out.println(cha + " is a alphabet character");
        }

         else if(cha == 'i' || cha == 'I'){
            System.out.println(cha + " is a alphabet character");
        }

         else if(cha == 'o' || cha == 'O'){
            System.out.println(cha + " is a alphabet character");
        }
         else if(cha == 'u' || cha == 'U'){
            System.out.println(cha + " is a alphabet character");
        }
        else{
            System.out.println("Enter valid character");
        }

    }
}

//identyfy the triangle type
class triangle{
    public static void main(String[] args) {
        Scanner q3 = new Scanner(System.in);
        System.out.println("Enter your triangle side1 length:");
        int side1 = q3.nextInt();
        System.out.println("Enter your triangle side2 length:");
        int side2 = q3.nextInt();
        System.out.println("Enter your triangle side3 length:");
        int side3 = q3.nextInt();
        if((side1==side2) && side1==side3){
            System.out.println("Equilateral Triangle");
        }
        else if((side1!=side2) && (side1!=side3) && (side2!=side3)){
            System.out.println("Isosceles triangle");
        }
        else if((side1==side2) && side1!=side3){
            System.out.println("Scalene triangle");
        }
        else{
            System.out.println("Not triangle");
        }
    }
}

//calculate like electricity bill 
class energy{
    public static void main(String[] args) {
        Scanner q4 = new Scanner(System.in);
        System.out.println("Enter your meter reading:");
        float x = q4.nextFloat();
        float amount = 0;
        if(x==0 || x<100){
           amount = x * 1.5f;
        }
        else if(x==100 || x<200){
           amount = 100 * 1.5f + (x-100)*2.5f;
        }
         else if(x==200 || x<500){
           amount = 100 * 1.5f + 100 * 2.5f + (x-200) * 3.5f ;
        }
        else{
            System.out.println("Enter valid energy amount");
        }
        System.out.println("Total amount is " + amount);
    }
}
