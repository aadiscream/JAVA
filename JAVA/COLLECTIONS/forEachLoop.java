import java.util.*;
public class forEachLoop {
    public static void main(String[] args){
        List<Integer> al=Arrays.asList(10,23,30,40,5);
        for(Integer x: al){
            System.out.print(x+" ");
        }
        al.forEach(x->System.out.print(x+" "));
        System.out.println();
        al.stream()
        .forEach(x->System.out.print(x+" "));
        System.out.println();
        al.stream()
        .filter(x->x>10)
        .filter(x->x % 2 ==0)
        .forEach(x->System.out.print(x+" "));

    } 
}
