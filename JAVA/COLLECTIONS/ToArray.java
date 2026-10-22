import java.util.ArrayList;
import java.util.List;

public class ToArray {
public static void main(String args[]){
    // Queue <Integer> q = new ArrayDeque<Integer>();
    List<Integer> list = new ArrayList<Integer>();
    list.add(10);
    list.add(12);
    list.add(30);
    Object []arr=list.toArray();
    for(Object x: arr){
        System.out.println(x);
    }
}
}