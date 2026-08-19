import java.util.Scanner;

public class Reversestring {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String a=sc.nextLine();
        String reverse="";
        int n=a.length();
        for(int i=n-1;i>=0;i--){
            reverse=reverse+a.charAt(i);
        }
        System.out.println(reverse);
    }
}
