import java.util.*;
class isEvenIsOdd{
    public static void main(String[] args){
        ArrayList<Integer> num=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        try(Scanner scn=new Scanner(System.in)){
        for(int i=0; i<5; i++){
            System.out.print("enter data = ");
            num.add(scn.nextInt());
        }}
        for(int x:num){
            if(x%2==1){
                odd.add(x);
            }else{
                even.add(x);
            }
        }
        System.out.print(odd+"\n"+even);
    }
}