import java.util.*;

public class searching {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int arr[] = new int[10], i = 0;
        System.out.print("Enter the elements of the array : ");
        while (i < 10) {

            arr[i] = scn.nextInt();
            i++;
        }
        System.out.print("Enter the number to search : ");
        int num = scn.nextInt();
        scn.close();
        for (i = 0; i <= 10; i++) {
            if (num == arr[i]) {
                System.out.printf("%d founded and its position is %d", num, i + 1);
                return;
            }
        }
        System.out.printf("%d not founded", num);
    }

}
