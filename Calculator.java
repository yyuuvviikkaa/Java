import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double n1 = input.nextDouble();
        System.out.println("Enter the second number: ");
        double n2 = input.nextDouble();
        System.out.println("Enter 1 for Addition: ");
        System.out.println("Enter 2 for Subtraction: ");
        System.out.println("Enter 3 for Multiplication: ");
        System.out.println("Enter 4 for Division: ");
        int operation = input.nextInt();
        if(operation==1) {
            System.out.println(n1 + n2);
        }
            else if(operation==2) {
                System.out.println(n1 - n2);
        }
            else if(operation==3) {
                System.out.println(n1 * n2);
        }
            else if(operation==4) {
                System.out.println(n1 / n2);
        }
            else {
            System.out.println("Invalid Operation");
        }




    }
}
