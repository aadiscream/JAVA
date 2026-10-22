import java.util.Scanner;

public class UsreAndPwd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String usr = "ADMIN", pwd = "ADITYA420";
        System.out.print("Enter USERNAME : ");
        String us = scn.nextLine();
        System.out.print("Enter PASSWORD : ");
        String pd = scn.nextLine();
        if (usr.equals(us) && pwd.equals(pd)) {
            System.out.println("\"WELCOME\"");
        } else {
            System.out.println("TRY AGAIN");
        }
        scn.close();
    }
}
