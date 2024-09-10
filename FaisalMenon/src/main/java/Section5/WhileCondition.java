package Section5;

import java.util.Scanner;

public class WhileCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        while (number > 0){
            stringBuilder.append(number % 10);
            number /= 10;
        }
        System.out.println(stringBuilder);
    }
}
