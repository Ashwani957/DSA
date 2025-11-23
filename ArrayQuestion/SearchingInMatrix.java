public class SearchingInMatrix {


    public static int [] printpatter(int [][] math, int target){

        // Base Condition 
        if(math==null || math.length==0 || math[0].length==0){
            return new int [] {-1,-1};
        }
        int rows=math.length; 
        int cols=math[0].length;
    int i = 0 ; 
    int j = cols-1;

    while(i<rows && j>=0){
        // get the value 
        int val=math[i][j];
        //compare the value 
        if(val==target){
            return new int [] {i,j};
        }
        
        // if the matrix value at mat[i][j] are bigger then we move to left 
        else if( val>target){
            // cols will be minus 
            j--;
        }
        else {
            // val<target 
            i++ ; // move down 
        }

    }

    // if we did not find any value then we will return the [-1,-1]
return new int []{-1,-1};



    }
    public static void main (String args[]){
         int[][] mat = {
            {1,  3,  5,  7},
            {2,  4,  6,  8},
            {9, 11, 13, 15},
            {10,12, 14, 16}
        };
        int target=11;
     int[] pos =  printpatter(mat,target);

     if(pos[0]!=-1){
        System.out.println("Found at "+pos[0] + "," +pos[1] + " ");
     }
     else {
        System.out.println("Not found");
     }
    }
}