import java.util.Scanner;

public class Isprime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int a=0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
              a=1;
              break;
            }
        }
        if(a==0)
        System.out.println("number is prime");
        else
        System.out.println("number is not prime");

    }
}
