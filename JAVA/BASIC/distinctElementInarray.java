import java.util.Scanner;

public class distinctElementInarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the range of an array : ");
        int n = scn.nextInt(), arr[] = new int[n], distinct = 0;
        boolean dist = true;
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter dat for arr[%d] = ", i);
            arr[i] = scn.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    dist = false;
                    break;
                }
            }
            if (dist == true) {
                distinct++;
            }
            dist = true;
        }
        System.out.println("Total distinct elements are : " + distinct);
        scn.close();
    }
}
