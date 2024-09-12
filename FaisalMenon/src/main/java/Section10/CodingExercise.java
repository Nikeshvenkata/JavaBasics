package Section10;

public class CodingExercise {
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] cubeOfNumbers(int[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * arr[i] * arr[i];
        }
        return arr;
    }
    public static double averageArray(int[] arr){
        int sum = 0; double average = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        average = (double) sum / arr.length;
        return average;
    }
    public static int[] reverseArray(int[] arr){
        int i = 0, j = arr.length - 1;
        while (i < j){
            int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            i++; j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1; arr[1] = 2; arr[2] = 3; arr[3] = 4; arr[4] = 5;
        System.out.println(averageArray(arr));
        printArray(cubeOfNumbers(arr));
        printArray(reverseArray(arr));
    }
}
