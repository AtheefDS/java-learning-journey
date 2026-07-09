import java.lang.System;
import java.util.Scanner;
class ex1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = scan.nextInt();
        for(int i = 1 ; i<n ; i++){
            System.out.println(i);
        }

    }
}

class ex2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = scan.nextInt();
        int i = 1;
        for(;i<=n;i++){
            System.out.println(i);
        }
    }
}