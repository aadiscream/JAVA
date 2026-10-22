import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        if (num % 2 == 0) {
            System.out.printf("%d is even", num);
        } else {
            System.out.printf("%d is odd", num);
        }
        scn.close();
    }

}
