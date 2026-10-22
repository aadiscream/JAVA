import java.util.Scanner;
import java.io.File;

public class readfile {
    public static void main(String[] args) {
        try {
            File obj = new File("text1.txt");
            Scanner myreader = new Scanner(obj);
            while (myreader.hasNextLine()) {
                String data = myreader.nextLine();
                System.out.print(data);
            }
            myreader.close();
        } catch (Exception e) {
            System.out.println("An error occured");
        }
    }
}
