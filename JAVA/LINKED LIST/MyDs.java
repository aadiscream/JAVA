import java.util.*;
public class MyDs{
     public static void main(String args[]){
        // ArrayList<Integer> list=new ArrayList<>();
        DS ds=new DS();
        ds.add(10);
        ds.add(20);
        ds.add(10);
        ds.removeAndPrint(10);

    }
}
class DS {
    LinkedList<Integer> list=new LinkedList<>();
    void add(int n){
        list.add(n);
    }
    void removeAndPrint(int n){
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            Integer x=(Integer)it.next();
            if(x.equals(n)){
                it.remove();
            }
        }
        System.out.print(list);
    }
}

