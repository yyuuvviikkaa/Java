import java.util.Scanner;

public class Countevenodd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number= ");
        int n = sc.nextInt();
        int last, even = 0, odd = 0;
        while (n > 0) {
            last = n % 10;
            n = n / 10;
            if (last%2 == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }
        }
        System.out.println("no of even digits=" + even);
        System.out.println("no of odd digits=" + odd);

    }

}

