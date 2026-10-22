import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = " ";
        int len = s1.length() - 1;
        while (len >= 0) {
            s2 = s2 + s1.charAt(len);
            len--;
        }
        scn.close();
        System.out.println("reverse of " + s1 + " is " + s2);
    }
}
