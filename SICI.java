import java.util.Scanner;

public class SICI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter princple amt");
        double p = sc.nextDouble();
        System.out.println("Enter rate of interest");
        double r = sc.nextDouble();
        System.out.println("Enter time period");
        double t = sc.nextDouble();
        double amt,si,ci;
        si=(p*r*t)/100;
        System.out.println("Simple interest :" +si);
        amt=p*Math.pow((1+(r/100)),t);
        ci=amt-p;
        System.out.println("Compound interest :" +ci);
    }
}
