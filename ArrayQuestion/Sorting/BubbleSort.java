
public class BubbleSort {

    public static void sortingBubble(int arr[]) {
        int n = arr.length;
        int count = 0;

        // time complexity O(N2)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                // for descending order just return it 
                if (j + 1 < arr.length && arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                count++; // just to understand how many time our loop will run 
            }
        }
        System.out.println(count);

    }

    public static void main(String args[]) {

        int arr[] = {2, 5, 1, 10, 5, 2, 9};
        sortingBubble(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

// In Bubble sort we have n-1 number or iteration where and in every iteration we push the largest element at the last 
