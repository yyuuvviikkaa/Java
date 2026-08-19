import java.util.Scanner;

public class StringDeleteSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str =sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        String temp="";
        int l=str.length();
        for(int i=0;i<l;i++){
            if(str.charAt(i)==' '){
                sb.deleteCharAt(i);
            }
            else{
                temp=temp+str.charAt(i);
            }
        }
        System.out.println(temp);
    }
}
