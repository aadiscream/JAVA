import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        System.out.print("Enter any no ");
        Scanner scn = new Scanner(System.in);
        int j = 1, num = scn.nextInt();
        for (int i = 1; i <= num; j = 1, i++) {
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println("");
        }
        scn.close();
    }
}
