import java.util.Scanner;

public class CheckIfSorted {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arr[] = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter data for arr[%d] : ", i);
            arr[i] = scn.nextInt();
        }
        scn.close();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println(" Not Sorted");
                return;
            }
        }
        System.out.println("Sorted");
        scn.close();
    }
}