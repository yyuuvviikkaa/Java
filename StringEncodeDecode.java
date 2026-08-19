import java.util.Scanner;

public class StringEncodeDecode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String str=sc.nextLine();
        char ch=' ';
        for(int i=0;i<str.length();i++) {
            ch=str.charAt(i);
            if (ch == 'a' || ch == 'A' || ch== 'e' || ch == 'E' || ch== 'i' || ch == 'I' || ch == 'U' || ch == 'O' || ch == 'o' || ch == 'u') {
                ch= (char) (ch+ 2);
            } else {
                ch= (char) (ch+ 1);
            }
            System.out.print(ch);

        }
        System.out.println("");

    }
}
