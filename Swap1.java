import java.net.SocketOption;
import java.util.Scanner;

public class Swap1 {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int a = scnr.nextInt();
        int b = scnr.nextInt();
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("value of a =" + a);
        System.out.println("value of b =" + b);
    }
}
