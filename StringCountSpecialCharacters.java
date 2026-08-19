import java.util.Scanner;

public class StringCountSpecialCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence which include all special characters");
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='.'||str.charAt(i) =='"'|| str.charAt(i)==';'||str.charAt(i)==':'|| str.charAt(i)==','||str.charAt(i)=='!'){
             count++;
            }
        }
        System.out.println(count);

    }
}
