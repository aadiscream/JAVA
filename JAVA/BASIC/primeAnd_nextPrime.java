import java.math.BigInteger;
import java.util.Scanner;

public class primeAnd_nextPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        if (isPrime(n) == true)
            System.out.println(n + " is a prime number");
        else
            System.out.println(n + " is not a prime number");

        System.out.println(nextPrime(n) + " is next prime no");
    }

    public static Boolean isPrime(int n) {
        BigInteger b = BigInteger.valueOf(n);
        if (b.isProbablePrime(n) == true)
            return true;
        else
            return false;
    }

    public static int nextPrime(int n) {
        BigInteger b = BigInteger.valueOf(n);
        String a = b.nextProbablePrime().toString();
        return Integer.parseInt(a);
    }

}
