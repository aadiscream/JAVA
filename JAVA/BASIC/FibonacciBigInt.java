import java.util.*;
import java.math.BigInteger;

public class FibonacciBigInt {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the range of a Fibonacci Series : ");
        int range = scn.nextInt();
        scn.close();
        fibonacci(range);
    }

    static void fibonacci(int range) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(1);
        while (range > 0) {
            System.out.println(a);
            c = a.add(b);
            a = b;
            b = c;
            range--;
        }
    }
}
