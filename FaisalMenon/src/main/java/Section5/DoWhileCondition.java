package Section5;

import java.util.Scanner;

public class DoWhileCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int in = 0;
        do{
            System.out.println("Enter the Value of A: ");
            int a = input.nextInt();
            System.out.println("Enter the Value of B: ");
            int b = input.nextInt();
            System.out.println("Total: " + (a + b));
            System.out.println("Enter 1 to continue, Else click anything to exit");
            in = input.nextInt();
        }while (in == 1);
    }
}
