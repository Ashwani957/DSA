
import java.util.Vector;
public class IntersectionTwoArray{

    public static Vector<Integer> intersectionarray(int arr[], int arr2[]){
        // int m=arr.length-1;
        // int n =arr2.length-1;
int i = 0 , j = 0 ; 
Vector <Integer> ans =new Vector<>();
        while (i<arr.length && j<arr2.length){

            // avoid duplicate element 

           while (i+1<arr.length &&arr[i]==arr[i+1]){
                 i++;
            }
            while ( j+1 <arr2.length && arr2[j]==arr2[j+1]){
                j++;
            }
            // this line should through the error index out of boundary when i = 7 then 7+1=8
        
            // check condition if arr[i] is greater then arr[j] then incrment it 
            if(arr[i]<arr[j]){
                i++;
            }
            // if arr[i]is greate then increment the smaller  one 
            else if(arr[i]>arr[j]){
                j++;
            }
            else {
                ans.add(arr2[j]);
                i++; 
                j++; 

                // skip the duplicate element 
            while (i+1<arr.length &&arr[i]==arr[i+1]){
                 i++;
            }
            while ( j+1 <arr2.length && arr2[j]==arr2[j+1]){
                j++;
            }


            }
            
        }
        return ans ; 

    } 

    public static void main (String args[]){
        int arrOne[]={1,2,2,3,4,5,6,8};
        int arrTwo[]={2,4,8,9};
     Vector<Integer> ans2=intersectionarray(arrOne,arrTwo);
        for(int arr:ans2){
            System.out.print(arr+" ");
        
        }
    }
}