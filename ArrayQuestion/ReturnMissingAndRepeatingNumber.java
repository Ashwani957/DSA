// import java.util.Arrays; 
// public class ReturnMissingAndRepeatingNumber {

//     public static int[] findMissingRepeatingNumber(int arr[], int n) {
//         int repeating = - 1, missing = -1;
//         for (int i = 0; i < n; i++) {
//             int count = 0;
//             // traverse over the array 
//             for (int j = 0; j < n ; j++) {
//                 if (arr[j] == i) {
//                     count++;
//                 }
//                 if (count==2) {
//                     repeating = i;
//                 } else if (count == 0) {
//                     missing = i;
//                 }
//                 if (repeating != -1 && missing != -1) {
//                     break;
//                 }
//             }
//         }
//         return new int[]{repeating, missing};
//     }
//     public static void main(String args[]) {
//         int arr[] = {4, 3, 6, 2, 1, 1};
//         int n = arr.length;
//         int ans[] = findMissingRepeatingNumber(arr, n);
//         System.out.println(Arrays.toString(ans));
//     }
// }
// second approach : using frequency 

import java.util.Arrays;

public class ReturnMissingAndRepeatingNumber {

    public static int[] findMissingRepeatingNumber(int arr[], int n, int frequency[]) {

        // time complexity is O(n)
        for (int i = 0; i < n; i++) {
// frequency[4] = frequency[4] + 1
// frequency[4] = 0 + 1 = 1
            frequency[arr[i]] = frequency[arr[i]] + 1;
        }

        int repeating = -1, missing = -1;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] == 2) {
                repeating = i;
            } else if (frequency[i] == 0) {
                missing = i;
            }
        }

        return new int[]{repeating, missing};

    }

    public static void main(String args[]) {
        int arr[] = {4, 3, 6, 2, 1, 1};
        int n = arr.length;
        int frequency[] = new int[n + 1];

        int ans[] = findMissingRepeatingNumber(arr, n, frequency);
        System.out.println(Arrays.toString(ans));

    }
}
