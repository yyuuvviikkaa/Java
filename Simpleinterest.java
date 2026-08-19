import java.util.Scanner;
public class Simpleinterest {
    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter profit=");
        int P =scnr.nextInt();
        System.out.println("Enter Rate of Interest =");
        int R =scnr.nextInt();
        System.out.println("Enter Time =");
        int T = scnr.nextInt();
        int SI;
        SI =( P*R*T)/100;
        System.out.println("Simple Interest is ="+SI);

    }
}
