import java.util.Scanner;

public class Vowelconsonant {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter an alphabet");
        char a = scnr.next().charAt(0);
        if(a=='A'|| a=='a'||a=='E'||a=='e'||a=='I'||a=='i'||a=='O'||a=='o'||a=='U'||a=='u'){
            System.out.println("Entered alphabet is vowel");
        }
        else{
            System.out.println("Entered alphabet is consonant");
        }
    }
}
