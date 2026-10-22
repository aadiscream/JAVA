import java.util.*;

public class nthTermaAp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int ans = 0, fTerm, diff, nth;
        System.out.print("Enter first term : ");
        fTerm = scn.nextInt();
        System.out.print("Enter diff : ");
        diff = scn.nextInt();
        System.out.print("Enter the nth term you want to find : ");
        nth = scn.nextInt();
        scn.close();
        while (nth > 0) {
            ans = fTerm;
            fTerm += diff;
            nth--;
        }
        System.out.print("ans is " + ans);
    }
}
