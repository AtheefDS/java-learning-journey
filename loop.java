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

class ex3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = scan.nextInt();
        int i ,j =0;
        for(i=0;i<=n;i++){
            System.out.println(i);
        }
    }
}



class ex5{
    public static void main(String[] args) {

        int i,j;
        for (i = 1, j = 0; i <= 5 && j < 3; i++ ) {
            // Concatenated the integers into a readable string
            System.out.println(i + " " + j); 
        } 
    }
}
