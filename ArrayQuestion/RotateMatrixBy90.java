
// Brute force 
// import java.util.Arrays;
// public class RotateMatrixBy90 {
//     public static void printRotateMatrix(int arr[][]) {
//         int n = arr.length;
//         int temp[][] = new int[n][n];   
//         // rotate in the new array 
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 temp[j][n - 1 - i] = arr[i][j];
//             }
//         }
//         // copy the rotate array to the orginal array 
//         for(int i = 0 ;i<n;i++){
//             for(int j = 0 ; j<n ;j++){
//                 arr[i][j] = temp[i][j]; 
//             }
//         }
//     }
//     public static void main(String args[]) {
//         int[][] matrix = {
//             {1, 2, 3, 4},
//             {5, 6, 7, 8},
//             {9, 10, 11, 12},
//             {13, 14, 15, 16}
//         };
//         System.out.println("before print rotate matrix");
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//         printRotateMatrix(matrix);
//         System.out.println("after print rotate matrix");
//         for (int i = 0; i < matrix[0].length; i++) {
//             for (int j = 0; j < matrix.length; j++) {
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// optimal solution 
public class RotateMatrixBy90 {

    public static void printRotateMatrix(int arr[][]) {
swapMatrix(arr);
    }

    public static void reverseArray(int arr[]) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void swapMatrix(int arr[][]) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                //    transpose 
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }

        }

        for (int i = 0; i < arr[0].length; i++) {
            // we send row of the matrix and reverse it 
            reverseArray(arr[i]);
        }

    }

    public static void main(String args[]) {

        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        // System.out.println("before print rotate matrix");
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // printRotateMatrix(matrix);

        // System.out.println("after print rotate matrix");
        // for (int i = 0; i < matrix[0].length; i++) {
        //     for (int j = 0; j < matrix.length; j++) {
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        swapMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }

    }
}
