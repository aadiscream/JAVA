import java.util.Scanner;

public class lastDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.printf("enter any no : ");
        int a = scn.nextInt();
        a = Math.abs(a);
        int mod = a % 10;
        System.out.printf("Last digit of %d is %d", a, mod);
        scn.close();
        // this is used to make _ve no +ve;
    }

}
