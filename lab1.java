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

//find average 
class average {

    float avg(int p,int q,int r){
        int sum = p+q+r;
            return ((sum)/3);
        }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        average obj = new average();
        int x = 10;
        int y = 5;
        int z = 15;

        float result= obj.avg(x,y,z);
        System.out.println(result);

        
        

    }
}

//data type convert
/**
 * Innerlab1
 */
class cast {

    public static void main(String[] args) {
        Scanner three = new Scanner(System.in);
        int x =5;
        float y = 10.5f;
        System.out.println((double)x);
        System.out.println((long)x);
        System.out.println((float)x);
        System.out.println((float)(long)x);
        System.out.println((int)y);
        System.out.println((long)y);

    }
}


//work with triangle
 class  triangle{

    double findArea(double b , double h){
        return .5f*b*h;
    }

    float findHypotenuse(double a , double c){
        return (int)Math.sqrt(a*a+ c*c);
    }

    double perimeter(double a , double b , float c){
        return a+b+c;
    }

    

    public static void main(String[] args) {
        double base=3.0;
        double height=4.0;
        double hypotenuse;
       
        triangle t1 = new triangle();

        double p = t1.findArea(base, height);
        System.out.println(p);
         
        float c =  t1.findHypotenuse(base , height);
        System.out.println(c);

        double g = t1.perimeter(base , height , t1.findHypotenuse(base , height) );
        System.out.println(g);




   
    }
}

//learn swap with java
class swap{
    public static void main(String[] args) {
       
        int x = 15;
        int y = 5;
        System.out.println(x);
        System.out.println(y);
       //after swaping
       int temp =x;
       x=y;
        y = temp;
        //we already defined variable y so above if you defined variable y again compilar error 
       System.out.println("x= " +x);
       System.out.println("y= " +y);
    }
}