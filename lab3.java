/*class StaticDemo{
    int num1;
    static int num2;
}
public class lab3 {
    public static void main(String[] args){
        StaticDemo s1 = new StaticDemo();
        StaticDemo s2 = new StaticDemo();

        s1.num1 = 15;
        s1.num2 = 17;
        s2.num1 = 22;
        s2.num2 = 28;
        System.out.println(s1.num1);
        System.out.println(s1.num2);
        System.out.println(s2.num1);
        System.out.println(s2.num2);
    }
}

 */

class Dog{
    String breed;
    String size;
    int age;
    String color;

    static String vertebrate;

    public Dog(String breed , String size , int age , String color){
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public void  eat(){
        System.out.println(breed + " is eating.");
    }

    public void bark(){
        System.out.println(breed + " is barking");
    }

    public void displayInfo(){
        System.out.println("Breed: " + breed);
        System.out.println("size: " + size);
        System.out.println("Age: " + age + " years");
        System.out.println("Color: " + color);
        if(vertebrate != null){
            System.out.println("Vertable group: " + vertebrate);

        }
        System.out.println("------------");
    }

}

public class lab3 {
    public static void main(String[] args) {

        // --- Step 3: Create three Dog instances and set values ---
        Dog dog1 = new Dog("Neapolitan Mastiff", "Large", 5, "Black");
        Dog dog2 = new Dog("Maltese", "Small", 2, "White");
        Dog dog3 = new Dog("Chow Chow", "Medium", 3, "Brown");

        // --- Step 4: Display specific information about each dog ---
        System.out.println("=== INITIAL DOG INFORMATION ===");
        dog1.displayInfo();
        dog2.displayInfo();
        dog3.displayInfo();

        // --- Step 5: Invoke eat() and bark() methods ---
        System.out.println("=== ACTIONS ===");
        dog1.eat();
        dog1.bark();
        dog2.eat();
        dog2.bark();
        dog3.eat();
        dog3.bark();
        System.out.println("-----------------------------------\n");

        // --- Step 7: Assign the vertebrate name ---
        // Based on the provided classification chart, dogs are Mammals.
        Dog.vertebrate = "Mammals";

        // --- Step 8: Display the information again ---
        System.out.println("=== UPDATED DOG INFORMATION WITH CLASS VARIABLE ===");
        dog1.displayInfo();
        dog2.displayInfo();
        dog3.displayInfo();
    }
}




