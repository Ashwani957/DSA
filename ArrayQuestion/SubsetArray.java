// import java.util.Arrays;
// public class SubsetArray{


//     public static void isSubset(int arr1[],int arr2[] ){

//         for(int i = 0 ; i<arr1.length ; i++){
//             for(int j = 0 ; j<arr2.length;j++){
//                 if(arr1[i]==arr2[j]){
//                     arr1[i]=0;
//                 }
//             }
//         }

//     }
//     public static void main (String args[]){
//         int arrOne[]={11,1,13,21,3,7};
//         int arrTwo[]={11,1,70,3};
//  isSubset(arrTwo,arrOne); 
// for(int i = 0 ; i<arrTwo.length; i++){
//     if(arrTwo[i]!=0){
//         System.out.println("Not subset");
//     }
//     else {
//         System.out.println("Subset");
        
    
//     }
// }

//     }
// }


// Second approach 

import java.util.HashSet;
public class SubsetArray{

public static boolean isSubset (int arr1[],int arr2[]){

    HashSet<Integer> hs=new HashSet<>();

    for(int x : arr1){
        hs.add(x);
    }
    for(int y: arr2){
        if(!hs.contains(y)){
            return false ; 
        }
    }
    return true ; 

}
 

    public static void main(String args[]){

        int arr[]={11,1,13,21,3,7};
        int arr2[]={11,193,21};

    if(isSubset(arr,arr2)){
        System.out.println("Subset");
    }
    else {
        System.out.println("Not Subset");
    }


    }
}

