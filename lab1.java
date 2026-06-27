import java.lang.System;
import java.util.Scanner;
public class lab1 {
// convert variable fahrenheit to celsius
    public static void main(String[] args) {
        Scanner lab = new Scanner(System.in);
        
        int F = 212;
        System.out.println(F);
        float c= 98.5f;
        System.out.println(c);
        float F1 = (((c/5f)*9f) +32);
        System.out.println(F1);
        float c1 = (((F-32f)/9f)*5f);
        System.out.println(c1);
    }
}