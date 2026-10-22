import java.util.*;

public class stringsearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter text :");
        String txt = scn.nextLine();
        System.out.println("Find text :");
        String txt1 = scn.nextLine();
        int pos = txt.indexOf(txt1);
        while (pos >= 0) {
            System.out.print(pos + "\t");
            pos = txt.indexOf(txt1, pos + 1);
        }
        scn.close();
    }
}
