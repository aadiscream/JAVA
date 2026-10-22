import java.util.*;

public class lcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num = 0;
        for (int i = num1 < num2 ? num2 : num1; i <= (num1 * num2); i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                num = i;
                break;
            }
        }
        System.out.printf("LCM of %d and %d is %d", num1, num2, num);
        scn.close();
    }
}