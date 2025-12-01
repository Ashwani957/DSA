
import java.util.Arrays;


public class InsertionSort {

    public static void insertionSort(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < arr.length; i++) {
            // arra[i] is the element jisko uski sahi jaga par dalna h 
            int current = arr[i];
            int j = i - 1;  // we should use the j because we want to traverse on the loop
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                // we write like this so that it will compare with all element 
                j--;
            }
            //placement 
            arr[j + 1] = current;
        }
    }

    public static void main(String args[]) {
        int arr[] = {4, 82, 12, 8, 43, 98};
        InsertionSort is = new InsertionSort();
        is.insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
