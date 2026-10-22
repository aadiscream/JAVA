import java.util.*;

public class stringnewmethod {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("Aditya");
        sb.reverse();
        System.out.println(sb);
        sb.append(" kumar");
        System.out.println(sb);
        sb.setCharAt(0, 'X');
        System.out.println(sb);
        sb.delete(0, 6);
        System.out.println(sb);
        sb.insert(1, "Aditya");
        System.out.println(sb);
        scn.close();
    }
}