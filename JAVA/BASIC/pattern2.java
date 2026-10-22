import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > 0; j--) {
                System.out.print(i);
            }
            System.out.println("");
        }
        scn.close();
    }
}
