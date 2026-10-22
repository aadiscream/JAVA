public class Autoboxing {
    public static void main(String[] args) {
        int x1 = 10;
        Integer x2 = x1; // autoboxing
        int x3 = x2; // auto - unboxing
        System.out.println(x1 + "\n" + x2 + "\n" + x3);
    }

}
