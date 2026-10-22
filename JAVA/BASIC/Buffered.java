import java.io.*;

public class Buffered {
    public static void main(String[] args)
            throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("Enter any int ");
        int a = Integer.parseInt(br.readLine());
        System.out.printf("Enter any String ");
        String b = br.readLine();
        System.out.println("You have entered " + a + " and " + b);
    }
}
