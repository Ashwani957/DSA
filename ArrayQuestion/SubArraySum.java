

// we can done it with the help of the sliding window 

import java.util.Arrays; 
public class SubArraySum {

    public static int [] subArray(int arr[],int target){
    int i = 0 , j = 0 ; 

    int sum = 0 ; 

    while (j<arr.length && i <arr.length ){
        // we increase i with certain condition 
        sum+=arr[j];

        // if the subtraction is still more than the sum then we need to again iterate 
        while (sum>target && i<=j ){

            // we decreemnt from the sum 
            sum=sum-arr[i];
            i++; 

        }

        if(sum==target){
            return new int [] {i,j};

        }

        // condition that always increment the j 
        j++; 

    }

   // if did not have any match then return -1 and -1 
    return new int [] {-1,-1};

      

    }
    public static void main(String args[]){

        int arr[]={1,4,20,3,10,5};
        int target=33; 
        //the will return the array that contains the ans 
    int ans []=subArray(arr,target);
for(int i=ans[0] ; i<=ans[1];i++)
{
   System.out.print(arr[i]+" ");
}

    // System.out.println(Arrays.toString(ans));s

    

    }
}