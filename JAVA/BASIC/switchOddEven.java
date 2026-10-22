import java.util.Scanner;

public class switchOddEven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        scn.close();
        num = num > 0 ? 1 : num < 0 ? -1 : 0;
        switch (num) {
            case 1:
                System.out.printf("+ve");
                break;
            case -1:
                System.out.print("-ve");
                break;
            default:
                System.out.print("Your input is 0");
        }

    }
}
