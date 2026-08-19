import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int n = sc.nextInt();
        int a=n;
        int reverse = 0, last;
        while (n > 0) {
            last = n % 10;
            n = n / 10;
            reverse = reverse * 10 + last;

        }
        if (a == reverse) {
            System.out.println("The given number is a palindrome.");
        } else {
            System.out.println("The given number is not a palindrome.");
        }
    }
}
