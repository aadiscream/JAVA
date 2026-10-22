import java.util.*;

public class alldivisor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        System.out.print("Divisiors of " + num + " :\t");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + "\t");
            }
        }
        scn.close();
    }
}
