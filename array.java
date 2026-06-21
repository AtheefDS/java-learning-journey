<<<<<<< HEAD
//How to get integer input in arrays and also using for loop
import java.lang.System;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //get array size from user 
        System.out.println("Enter your array size:");
        int n = scan.nextInt();
        //create array
        int[] arr = new int[n];
        System.out.println("Enter " + n  + " elements:");
        //using for loop for easy for get input
        for(int i =0; i<n ; i++){
            arr[i] = scan.nextInt();
        }
        //print using for loop printing
        for(int i=0 ; i<n ; i++){
            System.out.println("Position at "+ i + " : " + arr[i]);
        }



    }
}

=======
//How to get integer input in arrays and also using for loop
import java.lang.System;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //get array size from user 
        System.out.println("Enter your array size:");
        int n = scan.nextInt();
        //create array
        int[] arr = new int[n];
        System.out.println("Enter " + n  + " elements:");
        //using for loop for easy for get input
        for(int i =0; i<n ; i++){
            arr[i] = scan.nextInt();
        }
        //print using for loop printing
        for(int i=0 ; i<n ; i++){
            System.out.println("Position at "+ i + " : " + arr[i]);
        }



    }
}

>>>>>>> 3a0a5c9 (Implement array input and output functionality in the array class)
