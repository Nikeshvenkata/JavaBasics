package Section10;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Initializing Array
        // 1. Assigning using index
        int[] a = new int[5];
        a[0] = 1; a[1] = 2; a[2] = 3; a[3] = 4; a[4] = 5;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // 2.Initializing in One Statement
        int[] b = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        // 3. Initializing using Array.fill
        int[] c = new int[5];
        Arrays.fill(c, 5);
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

        // 4. Initializing using for Loop
        int[] d = new int[5];
        for (int i = 0; i < d.length; i++) {
            d[i] = i + 1;
            System.out.print(d[i] + " ");
        }
        System.out.println();

        // 5. Initializing using User Input
        int[] e = new int[5];
        for (int i = 0; i < e.length; i++) {
            e[i] = input.nextInt();
            System.out.print(e[i] + " ");
        }
        System.out.println();
    }
}
