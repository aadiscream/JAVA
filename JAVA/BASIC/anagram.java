import java.util.*;

class anagram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter string : ");
        String s1 = scn.nextLine();
        System.out.println("enter string : ");
        String s2 = scn.nextLine();
        char sort1[] = s1.toCharArray(), sort2[] = s2.toCharArray();
        // int len = s1.length();
        Arrays.sort(sort1);
        Arrays.sort(sort2);
        if (Arrays.equals(sort1, sort2)) {
            System.out.println("this is an anagram");
        } else {
            System.out.println("this is not an anagram");
        }
        scn.close();
    }
}