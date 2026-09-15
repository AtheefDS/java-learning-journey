import java.util.Scanner;
public class excep{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no 1:");
        int n1 = sc.nextInt();
        System.out.println("Enter no 2:");
        int n2 = sc.nextInt();

        divide(n1,n2);
    }

    public static void divide(int n1 ,int n2){
        System.out.println(n1/n2);
    }
}