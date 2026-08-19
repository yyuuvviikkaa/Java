import java.util.Scanner;

public class Count {
    public  static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        int i=0;
        while(n>0){
            n=n/10;
            i=i+1;

        }
        System.out.println(i);
    }
}
