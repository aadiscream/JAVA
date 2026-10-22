import java.util.*;

public class cmpto {
    public static void main(String[] args) {
        {
            Scanner scn = new Scanner(System.in);
            String s1 = scn.nextLine();
            String s2 = scn.nextLine();
            int cmp = s1.compareTo(s2);
            if (cmp == 0) {
                System.out.println("Same");
            } else if (cmp > 0) {
                System.out.println("s1 greater");
            } else
                System.out.println("s1 smaller");
            scn.close();
        }
    }
}
