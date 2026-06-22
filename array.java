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
        //print using for loop printin
        for(int i=0 ; i<n ; i++){
            System.out.println("Position at "+ i + " : " + arr[i]);
        }



    }
}

// java array get input String types 
class Arraystring {
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);
        System.out.println("Enter your array size:");
        int n = scam.nextInt();
        scam.nextLine();
        String[] arra = new String[n];
        System.out.println("Enter your strings:");
        for(int i =0; i<n ; i++){
            arra[i] = scam.nextLine();

        }
        //print all values using for loop
        for(int i = 0 ; i<n ; i++){
            System.out.println(arra[i]);
        }
    }

    
}


//print numbers arrya and for loop
 class Numarray {

    public static void main(String[] args) {
        Scanner second = new Scanner(System.in);
        System.out.println("Enter your array size: ");
        int n = second.nextInt();
        System.out.println("Enter your first position number: ");
        int[] arr1 = new int[n];
        arr1[0] = second.nextInt();
         for(int i = 1; i < 10; i++) {
            arr1[i] = arr1[i-1] + 1;
        }

        System.out.println("Array numbers:");

        for(int i = 0; i < 10; i++) {
            System.out.println(arr1[i]);
        }


        
    }
    
}
// create 2 table 
class secondarray {
            public static void main(String[] args) {
                Scanner first = new Scanner(System.in);
                
                //product table
                for(int i = 1 ; i<=10 ; i++){
                    System.out.println("2 * " +  i  + " = " + 2 * i );
                }
            }
            
        }


