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