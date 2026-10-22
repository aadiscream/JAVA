public class bitwise {
    public static void main(String[] args) {
        int x = 5, y = 3;
        System.out.println(~x);
        // left shift
        System.out.println(y << 1);
        System.out.println(y << 2);
        System.out.println(y << 4);
        // right shift
        x = 33;
        System.out.println(x >> 2);
        x = -2;
        System.out.println(x >> 2);
        x = -2;
        System.out.println(x >>> 2);
    }
}
