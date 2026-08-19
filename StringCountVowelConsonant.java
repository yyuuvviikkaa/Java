import java.util.Scanner;

public class StringCountVowelConsonant {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        int p=str.length();
        int vowelcount=0;
        int consonantcount=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
                vowelcount++;
            }
            else {
                consonantcount++;
            }
        }
            System.out.println("number of vowels: "+vowelcount);
            System.out.println("number of consonants: "+consonantcount);


    }
}
