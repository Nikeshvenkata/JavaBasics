package Section5;

import java.util.Scanner;

public class CodingChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print(i*n + " ");
        }
    }
}
