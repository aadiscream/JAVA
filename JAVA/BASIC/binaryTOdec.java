import java.util.*;

public class binaryTOdec {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String s = " ";
        while (n > 0) {
            s = (n % 2) + s;
            n /= 2;
        }
        scn.close();
        System.out.println(s);
    }
}