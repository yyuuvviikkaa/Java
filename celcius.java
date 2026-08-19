import java.util.Scanner;
public class celcius {
    public static void main(String args[]) {
        Scanner scnr=new Scanner(System.in);
        System.out.print("Enter temperature in Celcius: ");
        double c =scnr.nextDouble();
        double f;
        f= (c*1.8) +32;
        System.out.println("The temperature in Fahrenheit is:"+f);
    }
}

