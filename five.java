import java.util.Scanner;
class animal{
    void eat(){
        System.out.println("All animals are eating");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("Dogs are barking");
    }
}

public class five {
    public static void main(String[] args){
        dog d = new dog();
        d.eat();
        d.bark();
    }
}