import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr=new int[20];
        System.out.println("Enter the range of an array = ");
        int range=scn.nextInt();
        int sum=0;
        for(int i=0; i<range; i++){
            System.out.println("enter the value : ");
            arr[i]=scn.nextInt();
        }
        while(range!=0){
            sum+=arr[range-1];
            range--;
        }
        System.out.print("sum of array = "+sum);
        scn.close();
    }
}
