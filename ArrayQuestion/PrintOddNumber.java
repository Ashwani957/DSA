
import java.util.Arrays;

public class PrintOddNumber {

    public static int[] oddNumberarray(int n) {

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            if ((2 * i + 1) % 2 != 0) {
                arr[i] = 2 * i + 1;

            }
        }
        return arr;
    }

    public static void main(String args[]) {
        int n = 5;
        int arr[] = oddNumberarray(n);
        System.out.println(Arrays.toString(arr));

    }
}
