import java.util.Arrays;
import java.util.Scanner;
public class ArrayGreatestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 numbes");
        int [] num = new int [20];
        for(int i=0;i<20;i++){
            num[i]=sc.nextInt();
        }
        Arrays.sort(num);
        String str=Arrays.toString(num);
        System.out.println("Greatest number : "+num[19]);
        System.out.println("Smallest number : "+num[0]);
    }

}
