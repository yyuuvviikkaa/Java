import java.util.Scanner;

public class Percentage {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks obtained in subject 1: ");
        double m1 = sc.nextDouble();
        System.out.println("Enter marks obtained in subject 2: ");
        double m2 = sc.nextDouble();
        System.out.println("Enter marks obtained in subject 3: ");
        double m3 = sc.nextDouble();
        double p;
        p=(((m1 + m2 + m3)/300)*100);
        System.out.println("The percentage obtained: "+p);
        if(p>=90){
            System.out.println("Grade: A+");
        }
            else if(p>=80 && p<90){
                System.out.println("Grade: A");
            }
            else if(p>=70 && p<80){
                System.out.println("Grade: B+");
            }
            else if(p>=60 && p<70){
                System.out.println("Grade: B");
            }
            else{
            System.out.println("Grade: C");
            }


    }
}
