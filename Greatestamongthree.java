import java.util.Scanner;

public class Greatestamongthree {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number=");
        int a=sc.nextInt();
        System.out.println("Enter second number=");
        int b=sc.nextInt();
        System.out.println("Enter third number=");
        int c=sc.nextInt();
        if(a>b && a>c) {
            System.out.println("The greatest number is " + a);
        }
            else if (b > a && b > c) {
                System.out.println("The greatest number is " + b);
            }
                else if (c > a && c > b) {
                    System.out.println("The greatest number is " + c);
                }
                else {
                    System.out.println("All numbers are equal");
               }
    }
}
