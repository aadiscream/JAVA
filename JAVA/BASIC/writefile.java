import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writefile {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        scn.close();
        try {
            FileWriter wr = new FileWriter("text1.txt");
            wr.write(input);
            wr.close();
            System.out.println("successfully wrote");
        } catch (IOException e) {
            System.out.println("An error");
        }
    }

}
