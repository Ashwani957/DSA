
import java.util.*;
public class IntersectionUnsorted{


    public static  int [] IntersectionUnsortedArray(int arr[] , int arr2[]){
int interarr[]=new int [arr2.length];
        HashSet<Integer> hs =new HashSet<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int x:arr){
            hs.add(x);
        }

   for(int y:arr2){
    if(hs.contains(y)){
        ans.add(y);
        hs.remove(y);// Avoid Duplicate Element 
    }
   }

//    Convert the Arraylist to array 
int [] result =new int [ans.size()];
for(int i = 0 ; i<ans.size() ; i++)
{
    result[i]=ans.get(i);
}


return   result;
    }


    public static void main (String args[]){

        int arrOne[]={5,3,2,10,11,12};
        int arrTwo[]={1,5,11,2,3};

     int arr[]=   IntersectionUnsortedArray(arrOne, arrTwo);
    for(int x :arr){
        System.out.println(x);
    }



    }
}