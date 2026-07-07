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

//identyfy the triangle type
class triangle{
    public static void main(String[] args) {
        Scanner q3 = new Scanner(System.in);
        System.out.println("Enter your triangle side1 length:");
        int side1 = q3.nextInt();
        System.out.println("Enter your triangle side2 length:");
        int side2 = q3.nextInt();
        System.out.println("Enter your triangle side3 length:");
        int side3 = q3.nextInt();
        if((side1==side2) && side1==side3){
            System.out.println("Equilateral Triangle");
        }
        else if((side1!=side2) && (side1!=side3) && (side2!=side3)){
            System.out.println("Isosceles triangle");
        }
        else if((side1==side2) && side1!=side3){
            System.out.println("Scalene triangle");
        }
        else{
            System.out.println("Not triangle");
        }
    }
}

//calculate like electricity bill 
class energy{
    public static void main(String[] args) {
        Scanner q4 = new Scanner(System.in);
        System.out.println("Enter your meter reading:");
        float x = q4.nextFloat();
        float amount = 0;
        if(x==0 || x<100){
           amount = x * 1.5f;
        }
        else if(x==100 || x<200){
           amount = 100 * 1.5f + (x-100)*2.5f;
        }
         else if(x==200 || x<500){
           amount = 100 * 1.5f + 100 * 2.5f + (x-200) * 3.5f ;
        }
        else{
            System.out.println("Enter valid energy amount");
        }
        System.out.println("Total amount is " + amount);
    }
}

// Enter the number printed only negative number
class negative{
    public static void main(String[] args) {
        Scanner q5 = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int x = q5.nextInt();
        if(x<0){
            System.out.println(x);

        }
        else {
            System.out.println("- " + x);
        }
    }
}

class check{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number:");
        int a = scan.nextInt();
        //check wheather the number odd or even
        if(a%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}

class compare{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = scan.nextInt();
        int b = scan.nextInt();

        //compare two numbers with using conditions 
        if(a==b){
            System.out.println("Equal numbers");
        }
        else if(a>b){
            System.out.println("a greater than b");
        }
        else if(a<b){
            System.out.println("a lessthan b");
        }
        else{
            System.out.println("Enter the correct numbers");
        }
    }
}

class identyfy{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = scan.nextInt();
        //put the condition for identyfy the number type
        if(a<0){
            System.out.println("Negative number");
        }
        else if(a>0){
            System.out.println("Positive number");
        }
        else if(a==0){
            System.out.println("a is zero");
        }
        
    }
}

class grade{
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter your mark");
        int mark = scan.nextInt();
        if(mark<=100 && mark>=90){
            System.out.println("Grade A");
        }
        else if(mark<=89 && mark>=80){
            System.out.println("Grade B");
        }
        else if(mark<=79 && mark>=70){
            System.out.println("Grade C");
        }
        else if(mark<70 && mark >=0){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Enter posible mark");
        }
    }
}

class week{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number between 1 to 7 :");
        int num = scan.nextInt();
        if(num==1){
            System.out.println("Monday");
        }
        else if(num==2){
            System.out.println("Tuesday");
        }
        else if(num==3){
            System.out.println("Wednesday");
        }
        else if(num==4){
            System.out.println("Thursday");
        }
        else if(num==5){
            System.out.println("Friday");
        }
        else if(num==6){
            System.out.println("Satday");
        }
        else if(num==7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("Enter valid number");
        }

    }
}

// check gain or loss
class decide{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your cost price:");
        int cost = scan.nextInt();
        System.out.println("Enter your selling price:");
        int sell = scan.nextInt();
        if(cost>sell){
            System.out.println("Your business loss");
        }
        else if(cost<sell){
            System.out.println("Your business gain smoothly");
        }
        else{
            System.out.println("Enter your correct selling and costing prices");
        }
    }
}
// check enter the first number divisible the enter the second number
class find{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int first = scan.nextInt();
        System.out.println("Enter the second number:");
        int second = scan.nextInt();
        if(first%second==0){
            System.err.println("The first number can divisibe by the second number");
        }
        else{
            System.out.println("The first number cannot divisible by the second number");
        }
    }
}