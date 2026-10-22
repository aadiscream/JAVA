import java.util.Scanner;

public class primefactor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        for (int i = 2; num > 0; i++) {
            if (isPrime(i) == true && num % i == 0) {
                System.out.print(i + "\t");
                num /= i;
                i = 1;
            }
        }
        scn.close();
    }
    public static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
