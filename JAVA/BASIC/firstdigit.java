import java.util.Scanner;

public class firstdigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        firstdig(a);
        scn.close();
    }

    public static void firstdig(int a) {
        while (a > 10) {
            a /= 10;
        }
        System.out.println("Last digit is " + a);
    }
}
