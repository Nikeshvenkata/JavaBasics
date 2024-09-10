package Section7;

import java.util.Scanner;

public class CodingExercise {
    public static void evenOrOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void BMICalculator(double height, double weight) {
        double out = weight / (height * height);
        System.out.println(out);
    }
    public static void SumOfPositiveNumbers(int[] arr){
        int sum = 0;
        for (int j : arr) {
            if (j > 0) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        evenOrOdd(13);

        BMICalculator(80, 1.8);

        int[] arr = {1, 3, 5, 7, -1, -7, -13, 0, 11, 15};
        SumOfPositiveNumbers(arr);
    }
}
