import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        for (int j = 0; j < a; j++) {
            for (int i = 0; i < a - 1 - j; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < j + 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        scn.close();
    }
}
