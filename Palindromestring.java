import java.util.Scanner;

public class Palindromestring {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String a=sc.nextLine();
        String reverse="";
        int n=a.length();
        for(int i=n-1;i>=0;i--){
            reverse=reverse+a.charAt(i);
        }
        if(a.equalsIgnoreCase(reverse)){
            System.out.println("The word is a palindrome");
        }
        else{
            System.out.println("The word is not a palindrome");
        }
    }
}
