import java.lang.System;
import java.util.Scanner;

 public class staticDemo{
    //instance variable 
    int num1;
    //class variable 
    static int num2;
    public static void main(String[] args) {
        staticDemo s1 = new staticDemo();
        staticDemo s2 = new staticDemo();

        s1.num1 = 15;
        s1.num2 = 17;
        // display s1 object variables
        System.out.println(s1.num1);
        System.out.println(s1.num2);

        s2.num1 = 22;
        s2.num2 = 28;
        System.out.println(s2.num1);
        System.out.println(s2.num2);


        
    }
}