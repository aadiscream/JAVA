import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a, sum = 0;
        System.out.printf("Enter any no : ");
        a = scn.nextInt();
        while (a > 0) {
            sum += a;
            a--;
        }
        System.out.printf("sum of first n no is %d ", sum);
        // n*(n+1)/2
        scn.close();
    }

}
