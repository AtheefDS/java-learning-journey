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
