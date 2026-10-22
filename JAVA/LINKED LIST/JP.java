import java.util.*;
public class JP {
    public static void main(String[] args){
        int rmv=-1;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n and k : ");
        int n=sc.nextInt(),k=sc.nextInt();
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0; i<n; i++){
            list.add(i);
        }
        sc.close();
        while(list.size()!=1){
            for(int i=0; i<k;i++){
                rmv++;
                if(rmv>=list.size()){
                    rmv=0;
                }
            }
            System.out.println(list.get(rmv)+" is removed");
            list.remove(rmv);
            rmv-=1;
        }
        System.out.println("last saved item is = "+list);
        sc.close();
    }
}
