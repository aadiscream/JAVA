import java.util.*;

class traveralinList{
    public static void main(String[] args){
        List<Integer> abc=new ArrayList<Integer>();
        abc.add(10);
        abc.add(15);
        abc.add(20);
        ListIterator<Integer> it=abc.listIterator();
        while(it.hasNext()){
        int x=(Integer)it.next();
        it.set(x*2);
            // System.out.println(it.next());
        }
        System.out.println(abc);
    }
}