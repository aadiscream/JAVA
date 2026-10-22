
import java.io.File;
import java.io.IOException;

public class createfile {
    public static void main(String[] args) {
        try {
            File obj = new File("New.txt");
            if (obj.createNewFile()) {
                System.out.println(obj.getName());
            } else {
                System.out.println("file already exist");
            }
        } catch (IOException r) {
            System.out.println("An error occured");
        }
    }

}
