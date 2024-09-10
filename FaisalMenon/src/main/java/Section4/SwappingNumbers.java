package Section4;

import java.util.Scanner;

public class SwappingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("A: " + a + " , B: " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("A: " + a + " , B: " + b);
    }
}
