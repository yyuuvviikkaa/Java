import java.util.Scanner;

public class Sumofdigits {
   public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int n=sc.nextInt();
       int sum=0;
       int last;
       while(n>0){
           last=n%10;
           n=n/10;
           sum=sum+last;
       }
       System.out.println(sum);

    }
}
