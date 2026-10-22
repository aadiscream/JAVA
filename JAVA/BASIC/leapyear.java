import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.printf("Enter any year :");
        int year = scn.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.printf("%d is leap year", year);
        } else {
            System.out.printf("%d is not a leap year", year);
        }
        scn.close();
    }
}