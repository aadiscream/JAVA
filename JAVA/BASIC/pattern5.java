import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(), i = 0;
        while (i < n) {
            int j = 0;
            while (j < n - i) {
                System.out.print(" ");
                j++;
            }
            j = 0;
            while (j < i * 2 + 1) {
                System.out.print("*");
                j++;
            }
            System.out.println("");
            i++;
        }
        scn.close();
    }
}
