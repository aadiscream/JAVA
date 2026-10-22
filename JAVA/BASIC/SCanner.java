import java.util.Scanner;

public class SCanner {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.printf("Enter any int : ");
        int a = scn.nextInt();
        scn.nextLine(); // consume the leftover newline
        System.out.println("Enter any string : ");
        String b = scn.nextLine();
        System.out.printf("your int is " + a + " and string is " + b);
        scn.close();
    }
}
