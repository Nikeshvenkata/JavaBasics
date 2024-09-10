package Section3;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int out = a > b ? a : (b > c ? b : c);
        System.out.println(out);
    }
}
