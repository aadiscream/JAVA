import java.io.File;

public class getinfo {
    public static void main(String[] args) {
        File obj = new File("D:\\PROGRAMMING\\JAVA\\test1.txt");
        if (obj.exists()) {
            System.out.println(obj.getName());
            System.out.println(obj.getAbsolutePath());
            System.out.println(obj.canRead());
            System.out.println(obj.canWrite());
            System.out.println(obj.length());
        } else {
            System.out.print("file not found");
        }
    }

}
