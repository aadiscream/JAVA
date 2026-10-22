import java.util.Scanner;

public class countDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = scn.nextInt(), a = 0;
        while (num > 0) {
            a++;
            num /= 10;
        }
        System.out.printf("Total digit = %d", a);
        scn.close();
    }
}