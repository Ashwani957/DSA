// public class SprialMatrix {

//     public static void sprailMatrix (int arr[][]){
//         int m = arr[0].length ; 
//         // System.out.println(m);
// int top=0  , right =m-1 , left=0 , bottom=m-1; 

// // first iteration from left to right 
// for(int i = left ; i<=right;i++){
//     System.out.print(arr[top][i]+" ");
// }
// System.out.println(" ");
// // for second iteration from top to bottom 
// for(int i = top+1; i<=bottom; i++){
//     System.out.print(arr[i][right]+" ");
// }
// System.out.println(" ");

// // for third iteration from right to left 
// for(int i = right-1 ; i>=left ; i--){
//     System.out.print(arr[bottom][i]+" ");
// }
// System.out.println(" ");

// // for fourth iteration from bottom to top 

// for (int i = bottom -1 ;i>=top+1 ; i-- ){
//     System.out.print(arr[i][left]+" " );
// }

// System.out.println(" ");

// // for second loop 
// System.out.println("second loop ");
// left++ ; top++ ;right--; bottom--; 

// for(int i = left ; i<=right ; i++){
//     // changes the coloum number 
//     System.out.print(arr[top][i]+" ");
// }

// System.out.println(" ");
// for(int i = top+1 ; i<=bottom ; i++){
//     System.out.print(arr[i][right]+" ");
// }
// System.out.println(" ");


// for(int i= right-1; i>=left ; i--){
//     System.out.print(arr[bottom][i]+" ");
// }
// System.out.println(" ");

// // for third iteration or spiral 
// right -- ; 
// top=top+1;
// for(int i = left;    i<=right; i++){
//     System.out.print(arr[top][i]+" ");

// }
// System.out.println(" ");

//     }



//     public static void main (String args[]){
// int[][] matrix = {
//     {1,  2,  3,  4,  5},
//     {6,  7,  8,  9, 10},
//     {11, 12, 13, 14, 15},
//     {16, 17, 18, 19, 20},
//     {21, 22, 23, 24, 25}
// };


//         sprailMatrix(matrix);

//     }
// }

// better appraoch 
import java.util.* ; 

public class SprialMatrix {

    public static List<List<Integer>> sprailMatrix (int arr[][]){
  int n =arr.length;
  int m =arr[0].length ; 
  int left =0 , right =m-1 ;
  int top=0 , bottom =n-1 ; 

  List<List<Integer>> result =new ArrayList<>();

List<Integer> row=new ArrayList<>();
  while(top<=bottom && left<=right){
    // rigth 
    for(int i = left ; i<=right ; i++){
      row.add(arr[top][i]);
    }
    top++;

    for(int i = top ; i<=bottom ; i++){
        row.add(arr[i][right]);
    }
    right--; 
    if(top<=bottom){
        for(int i = right ; i>=left ; i--){
            row.add(arr[bottom][i]);
        }
        bottom--; 
    }
  }

  if(left<=right){
    for(int i = bottom ; i>=top; i--){
        row.add(arr[i][left]);
    }
    left++;
  }
  result.add(row);
  return result ; 

    }



    public static void main (String args[]){
int[][] matrix = {
    {1,  2,  3,  4,  5},
    {6,  7,  8,  9, 10},
    {11, 12, 13, 14, 15},
    {16, 17, 18, 19, 20},
    {21, 22, 23, 24, 25}
};


  List<List<Integer>> result =      sprailMatrix(matrix);

System.out.println(Arrays.toString(result.toArray()));

    }
}