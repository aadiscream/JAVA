import java.util.Scanner;

public class calcolator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.printf("Enter two number :\n");
        int first = scn.nextInt(), second = scn.nextInt();
        System.out.print("Enter :\n" + 1 + " for Addition\n" + 2 +
                " for Substraction\n" + 3 + " for Multiplication\n");
        int choice = scn.nextInt();
        if (choice == 1) {
            System.out.printf("%d + %d = %d", first, second, first + second);
        } else if (choice == 2) {
            System.out.printf("%d - %d = %d", first, second, first - second);
        } else {
            System.out.printf("%d * %d = %d", first, second, first * second);
        }
        scn.close();
    }
}
