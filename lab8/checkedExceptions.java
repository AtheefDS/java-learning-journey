import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class checkedExceptions {

    public static void main(String[] args) {

        File file = new File("myfile.txt");

        try {

            if (!file.exists()) {
                throw new FileNotFoundException("File not found.");
            }

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();

        } catch (FileNotFoundException e) {

            System.out.println("File Not Found Exception: " + e.getMessage());

        } catch (IOException e) {

            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}
