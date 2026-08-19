import java.util.Scanner;

public class StringToggleCase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str=sc.nextLine();
        String str1="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
                if(Character.isUpperCase(ch)) {
                    str1 = str1 + Character.toLowerCase(ch);
                }
                else if(Character.isLowerCase(ch)){
                    str1=str1+Character.toUpperCase(ch);

                }
        }
        System.out.println(" Toggle Case : "+str1);

    }
}
