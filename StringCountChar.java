import java.util.Scanner;

public class StringCountChar {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        System.out.println("Enter a character: ");
        char ch=sc.next().charAt(0);
        int l=str.length();
        int count=0;
        for(int i=0;i<l;i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("number of Characters: "+count);
    }
}
