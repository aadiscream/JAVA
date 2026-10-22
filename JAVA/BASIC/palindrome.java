import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        scn.close();
        char a1[] = s1.toCharArray(), a2[] = s1.toCharArray();
        int len = s1.length();
        for (int i = 0; i < (len / 2); i++) {
            if (a1[i] != a2[len - i - 1]) {
                System.out.println("not a palindrome");
                return;
            }
        }
        System.out.println("palindrome");
    }
}
