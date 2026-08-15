import java.util.Scanner;

public class Demo {

    void weightCheck(double weight) throws InvalidWeightException {
        if (weight < 50) {
            throw new InvalidWeightException("Your weight is less than 50. You cannot donate blood.");
        } else {
            System.out.println("You can donate blood.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Demo demo = new Demo();

        System.out.print("Enter your weight: ");
        double weight = scanner.nextDouble();

        try {
            demo.weightCheck(weight);
        } catch (InvalidWeightException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
