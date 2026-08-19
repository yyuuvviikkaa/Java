import java.util.Scanner;

public class Specialno{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int temp=n;
        int sum=0,last;
        while(n>0) {
            last = n % 10;
            n = n / 10;
            int f=1;
            for(int i=last;i>0;i--) {
                f = f * i;

            }
            sum = sum + f;
        }
        if(temp==sum) {
            System.out.println("The number is a special number");
        }
        else {
            System.out.println("The number is not a special number");
        }
    }
}

