import java.util.*;

public class avgOfAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = scn.nextInt(), arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter data for an arr[%d] ", i);
            arr[i] = scn.nextInt();
        }
        System.out.print("avg of an array = " + avg(arr));
        scn.close();
    }

    public static int avg(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}