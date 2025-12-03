

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


