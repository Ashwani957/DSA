public class SortingBits {
    
    public static void  printPatter(int arr[]){
        int n = arr.length;
        int low=0 ,mid=0 , high=n-1;

        while (mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp; 
                low++; 
                mid++;
            }
            else if (arr[mid]==1){
                mid++;
            }
            else if (arr[mid]==2){
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }

        }
    }
    public static void main(String args[]){
        int arr[]={0,1,2,0,2,1,0,1,2};

        printPatter(arr);
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}