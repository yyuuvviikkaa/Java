import java.util.Scanner;

public class Leap {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year");
        int y=sc.nextInt();
        int last;
        last=y%100;
        if(last == 0) {
            if (y % 400 == 0) {
                System.out.println("The year is a leap year");
            } else {
                System.out.println("The year is not a leap year");
            }
        }
        else if(y%4==0){
            System.out.println("The year is a leap year");
        }
        else{
            System.out.println("The year is not a leap year");
        }
    }
}
