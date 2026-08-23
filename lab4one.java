import java.util.Scanner;

class triangle {
    int a;
    int b;
    int c;

    void triangleChecker() {
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Not valid triangle");
        }
    }

    void getPerimeter() {
        System.out.println("Perimeter = " + (a + b + c));
    }
}

public class lab4one {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        triangle t1 = new triangle();

        t1.a = a;
        t1.b = b;
        t1.c = c;

        t1.triangleChecker();
        t1.getPerimeter();

        scan.close();
    }
}