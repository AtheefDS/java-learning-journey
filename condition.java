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
