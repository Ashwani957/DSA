
import java.util.* ;
public class SubArrayPrefixContainsNegative {
    public static  void printsubArray(int arr[], int target){
     int sum =0; 
     HashMap<Integer,Integer> hs=new HashMap<>();
     for(int i = 0 ; i<arr.length ; i++){
            sum+=arr[i];


// if sum and target are equal 
if(sum==target){
    System.out.println("SubArray found at index 0 to "+i);
    return  ; 

}
       // check if sum is not equal to the target then add it pls 
      if(sum!=target && !hs.containsKey(sum)){
                hs.put(sum, i );
            }

            // Because to check whether it is present in the map or not 

          
            else  if( hs.containsKey(sum-target)){
                int start=hs.get(sum-target)+1;
                System.out.println("Subarray"+start+"to"+i);
                return  ; 
            }

     }


    }
    public static void main (String args[]){
     int arr[] = {10, 2, -2, -20, 10};
        int target = -10;
        printsubArray(arr, target);

    }
}