import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter any number");
        int num = scn.nextInt();
        for (int i = num; i > 0; i--) {
            for (int j = 1; j <= num; j++) {
                System.out.printf("*");
            }
            System.out.println("");
        }
        scn.close();
    }

}