package Section10;

public class ArrayMethods {
    public static int[] squaresOfGivenArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 11, 13};
        int[] out = squaresOfGivenArray(arr);
        for (int i = 0; i < out.length; i++) {
            System.out.print(out[i] + " ");
        }
    }
}
