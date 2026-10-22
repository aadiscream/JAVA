import java.util.List;
import java.util.Arrays;

public class methodReferance {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10, 20, 7, 8);
        al.forEach(methodReferance::printSquare);
    }

    public static void printSquare(Integer x) {
        System.out.println(x * x);
    }
}
