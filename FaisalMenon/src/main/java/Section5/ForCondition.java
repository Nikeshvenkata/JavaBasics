package Section5;

import java.util.Scanner;

public class ForCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i = 1, j = 11; i <= num; i++, j++){
            System.out.print(i + " " + j + " ");
        }
    }
}
