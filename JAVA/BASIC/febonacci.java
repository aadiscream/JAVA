import java.util.*;

public class febonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, b, c, n;
        System.out.print("enter the range of febonacci : ");
        n = scn.nextInt();
        scn.close();
        for (a = 0, b = 1; n > 0; n--) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }

}
