
class staticmember {
    static int a = 1;

    public static void showData(String name) {
        System.out.println(a + "\t" + name);
        a++;
    }

    public static void main(String[] args) {
        showData("aditya");
        showData("himanshu");
    }
}