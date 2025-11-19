

import java.util.*; 
public class UnionTwoArraycount{


public static int union(int arr[],int arr2[]){

   Set<Integer> set =new HashSet<>();
    for(int x:arr){
        set.add(x);
    }
    for(int y:arr2){
        set.add(y);
    }

    return set.size(); 


}


    public static void main (String args[]){
        int arr[]={1,2,3,4,5};
        int arrtwo[]={1,2,3};

  int ans = union(arr, arrtwo);
  System.out.println(ans);

    }
}