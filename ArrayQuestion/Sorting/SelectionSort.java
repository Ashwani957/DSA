
import java.util.Arrays;

public class SelectionSort {

    public static void selectionsort(int arr[]) {
        int n = arr.length;
        // time complexity O(n2)
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

    }

    public static void main(String args[]) {

        int arr[] = {2, 1, 5, 98, 23, 21};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
