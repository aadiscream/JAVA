import java.util.*;

public class gcd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int gcd = 1;
        for (int i = 1; i <= (num1 < num2 ? num1 : num2); i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        System.out.printf("gcd of %d and %d is %d", num1, num2, gcd);
        scn.close();
    }
}