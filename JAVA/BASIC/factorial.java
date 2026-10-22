import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int fact = 1, num = scn.nextInt();
        while (num > 0) {
            fact *= num;
            num--;
        }
        System.out.println("Factorial is " + fact);
        scn.close();
    }
}
