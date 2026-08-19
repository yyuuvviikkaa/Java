import java.util.Scanner;

public class Findyearmonthdays {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number =");
        int n=sc.nextInt();
        int y,m,d;
        y=n/365;
        n=n % 365;
        m=n/30;
        n=n%30;
        d=n/1;
        System.out.println("Number of year"+y);
        System.out.println("Number of month"+m);
        System.out.println("Number of day"+d);

    }
}
