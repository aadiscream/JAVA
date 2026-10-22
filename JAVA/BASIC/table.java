import java.util.*;

public class table {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.printf("Enter any no : ");
        int num = scn.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
        }
        scn.close();
    }

}
