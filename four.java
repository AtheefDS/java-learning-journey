import  java.util.Scanner;
class student{
    String name;
    int age;

    student(){
        name = "Mohamed";
        age = 23;

    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args){
        student s1 = new student();
        s1.display();
    }
}