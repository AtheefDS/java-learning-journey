import java.lang.System;
import java.util.Scanner;
public class nestfor {
    public static void main(String[] args) {
        for(int i = 0; i<3 ; i++){
            
            for(int j =0 ; j<=i ; j++){
                 System.out.print("*");
                
            }
            System.out.println();
           
        }
    }
}

/**
 * Innernestfor
 */
class Innernestfor {
public static void main(String[] args) {
    int i,j;
    for(i=1,j=0;i==10;i++,j++){
      System.out.print(i);
}
    
}}
