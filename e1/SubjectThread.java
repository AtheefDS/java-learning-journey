import java.util.Scanner;

class SubjectThread extends Thread {

    @Override
    public void run() {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter Semester " + i + " subject: ");
            String subject = input.nextLine();

            System.out.println("Subject: " + subject);

            try {
                Thread.sleep(1000);   // Sleep for 1 second
            }
            catch (Exception e) {
                System.out.println("The thread is Interrupted");
            }
        }

        System.out.println("Thread successfully terminated");
    }
}