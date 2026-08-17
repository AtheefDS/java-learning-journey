import java.util.Scanner;
class temperature{
    public static  void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double fahrenheit = 212;
        double celsius = 98.5;
        System.out.println("fahrenheit value before converting to celcius: " + fahrenheit);
        System.out.println("Fahrenheit value after converting to celcius");
        double f1 = ((fahrenheit-32)/9)*5;
        System.out.println(f1);
        System.out.println("Celcius value before converting to fahrenheit: " + celsius);
        System.out.println("Celcius value after converting to fahrenheit");
        double f2 = ((9/5) * celsius)+32;
        System.out.println(f2);
    }
}

class findAverage{
    double average(double a , double b , double c){
        return (a+b+c)/3;
    }
    public  static void main(String[] args){
        double x = 10;
        double y = 5;
        double z = 15;
        findAverage obj = new findAverage();

        double avg = obj.average(x , y , z);
        System.out.println(avg);
    }
}

class cast{
    public static void main(String[] args){
        int x = 5;
        double y = 10.5;

    }
}

class student{
    String name;
    int age;
    student(){
        name = "Atheef";
        age = 23;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args){
        student s1 = new student();
        s1.display();
    }
}

class school{
    String name ;
    static String university = "UOM";

    school(String n){
        name = n ;
    }
    void display(){
        System.out.println(name + " - " + university);
    }
    public static void main(String[] args){
        school s1 = new school("Alighar");
        school s2 = new school("Azhar");
        s1.display();
        s2.display();
        System.out.println(s1.name);
        System.out.println(school.university);
    }
}

class sisya {
    void display() {
        String name = "Atheef";
        int age = 23;

        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        student s1 = new student();
        s1.display();
    }
}
class teacher{
        String name;
        void displayName(){
            System.out.println("Name : " + name);
        }
        public static void main(String[] args){
            teacher t1 = new teacher();
            t1.name = "Atheef";
            t1.displayName();
        }
    }
