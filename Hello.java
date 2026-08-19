import java.util.Scanner;
public class Hello{
   public static void main(String[] args) {
       Scanner scnr= new Scanner(System.in);
       int a= scnr.nextInt();
       int b= scnr.nextInt();
       if(a>b){
           System.out.println(a);
       }
       else if(b>a){
           System.out.println(b);
       }
       else{
           System.out.println("both numbers are equal");
       }

    }
}
