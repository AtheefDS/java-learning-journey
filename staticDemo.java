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

// Implementing the Dog class as per the diagram in image_cf60e5.png
class Dog {
    // Instance variables from the diagram
    String breed;
    String size;
    int age;
    String color;

    // Requirement 6 & 7: Add a new class variable called vertebrate
    static String vertebrate = "Mammals"; 

    // Constructor to initialize object values
    public Dog(String breed, String size, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    // Methods from the diagram
    void eat() { 
        System.out.println(breed + " is eating."); 
    }
    
    void bark() { 
        System.out.println(breed + " is barking."); 
    }

    // Helper method to display dog information
    void display() {
        System.out.println("Breed: " + breed + ", Size: " + size + 
                           ", Age: " + age + ", Color: " + color + 
                           ", Classification: " + vertebrate);
    }
}

// Requirement 2: Implement another class called InstanceDemo
 class InstanceDemo {
    public static void main(String[] args) {
        // Requirement 3: Create three instances with values from image_cf60e5.png
        Dog d1 = new Dog("Neapolitan Mastiff", "Large", 5, "Black");
        Dog d2 = new Dog("Maltese", "Small", 2, "White");
        Dog d3 = new Dog("Chow Chow", "Medium", 3, "Brown");

        // Requirement 4 & 5: Display info and invoke methods
        Dog[] dogs = {d1, d2, d3};
        for (Dog d : dogs) {
            d.display();
            d.eat();
            d.bark();
            System.out.println(); // For spacing
        }
    }
}