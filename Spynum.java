import java.util.Scanner;

public class Spynum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int sum=0,last;
        int product=1;
        while(n>0){
            last=n%10;
            n=n/10;
            sum=sum+last;
            product=product*last;
        }
        if(sum==product){
            System.out.println("Entered number is spy number");
        }
        else{
            System.out.println("Not spy");
        }

    }
}
