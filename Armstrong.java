import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int temp=n;
        int a,sum=0,last;
        while(n>0) {
            last = n % 10;
            n = n / 10;
            a = last * last * last;
            sum = sum + a;
        }
        if(temp==sum) {
            System.out.println("The number is a armstrong number");
        }
        else {
            System.out.println("The number is not a armstrong number");
        }
    }
}
