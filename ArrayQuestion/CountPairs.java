// public class CountPairs{
//     public static int countpairs(int arr[],int target){
//             int counter= 0 ,i=0; 

//             for( i = 0 ; i<arr.length;i++){
//                 for(int j = i+1 ; j<arr.length; j++){
//                     if(arr[i]+arr[j]==target){
//                         counter++;
//                         // i++;
//                     }
//                 }
//             }

//             return counter;
        

//     }
//     public static void main (String args[]){

//         int arr[]={1,5,7,1};
//         int target=6; 
//       int ans=  countpairs(arr,target);
//       System.out.println(ans);



//     }
// }
 

// above is not a optimal solution 
import java.util.HashMap;

public class CountPairs {


    public static int countPair(int arr[],int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        int counter=0;
        for(int num:arr){
            int complement=target-num;

            // If this particular key is present then we should do otherwise we will add 
            if(map.containsKey(complement)){
                counter+=map.get(complement);
            }
           
                // it will work like when fist it will check whether the number eixsit in the map or not if does not exist then it will  add 
                map.put(num,map.getOrDefault(num,0)+1);
           
        }
        return counter; 

    }
    public static void main (String args[]){
        int arr[]={1,5,7,1,5};
      int count=  countPair(arr,6);
      System.out.println(count);

    }
}