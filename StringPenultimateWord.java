import java.util.Scanner;

public class StringPenultimateWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence : ");
        String str = sc.nextLine();
        int p=str.lastIndexOf(' ');
        int q=str.lastIndexOf(' ',p-1);
        System.out.println(str.substring(q,p+1));
    }
}
