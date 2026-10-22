import java.util.*;

public class sorting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int temp, arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter data for arr[" + i + "]");
            arr[i] = scn.nextInt();
        }
        scn.close();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
