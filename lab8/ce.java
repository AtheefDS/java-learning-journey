import java.io.*;
public class ce {
    public static void main(String[] args) throws IOException{
        FileReader fileReader = new FileReader("C:\\USER\\Desktop\\file.txt");
        BufferedReader bufferedReader= new BufferedReader(fileReader);
        System.out.println(bufferedReader.read());
        bufferedReader.close();
    }
}