import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = scnr.nextInt();
        int i,sum=0;
        for(i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
