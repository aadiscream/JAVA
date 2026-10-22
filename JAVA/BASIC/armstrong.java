import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any num : ");
        int num = scn.nextInt(), power = 0, copy = num, num2 = 0;
        while (copy > 0) {
            power++;
            copy /= 10;
        }
        copy = num;
        while (num > 0) {
            num2 += Math.pow((num % 10), power);
            num /= 10;
        }
        if (num2 == copy) {
            System.out.println(copy + " is an armstrong no");
        } else {
            System.out.println(copy + " is not an armstrong no");
        }
        scn.close();
    }

}
