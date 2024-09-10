package Section5;

import java.util.Scanner;

public class IfElseConditions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age > 18) {
            System.out.println("You are eligible for voting");
        } else if (age == 18) {
            System.out.println("Apply for Voter Card in the portal");
        }else {
            System.out.println("You are not eligible for voting");
        }
    }
}
