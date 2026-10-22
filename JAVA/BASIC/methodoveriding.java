public class methodoveriding {
    public static void main(String[] args) {
        base obj = new derived();
        obj.print();
    }
}

class base {
    void print() {
        System.out.println("I am from base");
    }
}

class derived extends base {
    void print() {
        System.out.println("I am from derived");
    }
}