import java.util.*;
import java.lang.Math;

public class nthTermGp {
    public static int gp(int a, int r, int n) {
        return (int) (a * Math.pow(r, n - 1));
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, r, n;
        System.out.print("Enter first term = ");
        a = scn.nextInt();
        System.out.print("Enter comman ratio = ");
        r = scn.nextInt();
        System.out.print("Enter nth term = ");
        n = scn.nextInt();
        int ans = gp(a, r, n);
        System.out.printf("your ans is %d", ans);
        scn.close();
    }
}
