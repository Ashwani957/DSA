// import java.util.Arrays;

// public class SortingTwoArraywithoutExtraSpace{
//     public static void printPatter(int arrOne[],int arrTwo[]){
// int j = 0 ;  
        
// for(int i = 0 ; i<arrOne.length;i++){
//   if(arrOne[i]>arrTwo[j]){
//                     int temp=arrOne[i];
//                     arrOne[i]=arrTwo[j];
//                     arrTwo[j]=temp;
//                     Arrays.sort(arrTwo);
//                 }
 
// }
              
        
//     }
//     public static void main (String args[]){

//         int arrOne[]={1,4,8,9};
//         int arrTwo[]={2,3,6,7};
//         printPatter(arrOne,arrTwo);

//         System.out.println(Arrays.toString(arrOne));
//         System.out.println(Arrays.toString(arrTwo));


//     }
// }


public class SortingTwoArraywithoutExtraSpace {

public static int gap (int gap){

    if(gap<1) return 0 ; 

    // How it work 
    /*
    gap=5 ;
    5/2=2  ; return divident 
    5%2=1; return remainder 
    next gap= 2+1=3;
     * 
     */
    return (gap/2)+(gap%2);


}


    public static void sortingarray(int arr[] , int arr2[]){
        int n=arr.length; 
        int m = arr.length ;

        gap(n+m);
        while(gap>0){
            int i = 0 ; j=gap;
// if j value is less then n+m because it hit the boundary of it 

            while(j<n+m){
 // when both n and n lies in the same array when the lenght will be small  
                if(i<n&&j<n){
                    if(arr[i]>arr[j]){
                        int temp=arr[i];
                        arr[i]=arr2[j];
                        arr2[j]=temp;
                    }
                }

                // Second case when one lies in the array one and other lies in the array two the we should do 
               else  if(i<n && j>=n){
                    if(arr[i]>arr2[j-n]){
                    // Here we swap the value 
                        int temp=arr[i];
                        arr[i]=arr2[j-n];
                        arr2[j-n]=temp;
                        
                    }
                }

                // third case when both are lie in the second array
                else {
                    if(i>=n && j<n){
                         if(arr2[i-n]>arr2[j-n]){
                            int temp=arr2[i-n];
                            arr2[i-n]=arr2[j-n];
                            arr2[j-n]=temp;
                         }

                    }
                }
                

i++;
j++;
            }

gap=nextGap(gap);

        }


    }

    public static void main (String args[]){
        int arr[]={1,4,8,9};
        int arr2[]={2,3,6,7};

    }
}