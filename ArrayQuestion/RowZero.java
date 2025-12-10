// public class RowZero {

//     public static void setZeroes(int [][] matrix) {
//         int n = matrix.length;
//         int m = matrix[0].length;

//         // First pass: mark rows and columns
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (matrix[i][j] == 0) {
//                     markRow(matrix, i);
//                     markCol(matrix, j);
//                 }
//             }
//         }

//         // Second pass: convert all -1 to 0
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (matrix[i][j] == -1) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//     }

//     public static void markRow(int [][] matrix, int row) {
//         int m = matrix[0].length;
//         for (int j = 0; j < m; j++) {
//             if (matrix[row][j] != 0) {
//                 matrix[row][j] = -1;
//             }
//         }
//     }

//     public static void markCol(int [][] matrix, int col) {
//         int n = matrix.length;
//         for (int i = 0; i < n; i++) {
//             if (matrix[i][col] != 0) {
//                 matrix[i][col] = -1;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int arr[][] = {
//             {1,1,1,1},
//             {1,0,0,1},
//             {1,1,0,1},
//             {1,1,1,1}
//         };

//         setZeroes(arr);

//         // print output
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[0].length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// Better approach 


public class RowZero {

    public static void setZeroes(int [][] matrix) {
       int n = matrix[0].length ; 

       int m = matrix.length ; 

    //    two array like which store the element 
     int [] col= new int [m];
     int [] row = new int [n];

       for(int i = 0 ; i<n ; i++){
        for(int j = 0 ; j<m ; j++){
            if(matrix[i][j]==0){
                row[i]=1;
                col[j]=1;
            }
        }
       }
       



    //    change the one to zero 
    for(int i = 0 ; i<n ; i++){
        for(int j=0 ; j<m ; j++){
            if(row[i]==1 || col[j]==1){
                matrix[i][j]=0;
            }
        }
    }
      
    }

    public static void main(String[] args) {
        int arr[][] = {
            {1,1,1,1},
            {1,0,0,1},
            {1,1,0,1},
            {1,1,1,1}
        };

        setZeroes(arr);

        // print output
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}