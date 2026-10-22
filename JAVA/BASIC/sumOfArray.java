import java.util.*;

public class sumOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = scn.nextInt(), arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter data for an arr[%d] ", i);
            arr[i] = scn.nextInt();
        }
        System.out.print("Sum of an array = " + sum(arr));
        scn.close();
    }

    public static int sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
