public class methodoverloading {
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        methodoverloading a = new methodoverloading();
        System.out.println(a.sum(1, 12));
        System.out.println(a.sum(1, 12, 3));
        System.out.println(a.sum(1.1, 2.4));
    }

}
