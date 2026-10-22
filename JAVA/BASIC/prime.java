import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        for (int i = 2; i*i< num; i++) {
            if (num % i == 0) {
                System.out.print(num + " is not a prime number");
                scn.close();
                return;
            }
        }
        System.out.print(num + " is a prime number");
        scn.close();
    }
}