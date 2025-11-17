public class MinMax{

    public static int [] findMinMax(int arr[]){

        // Here we intailize the value of min and max 
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        // Here we iterate over the loop 
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return new int [] {min,max};
    }
    public static void main (String args[]){
int arr[]={2,4,9,1,23,12,1211};
int ans [] =findMinMax(arr);
System.out.println(ans[0]);
System.out.println(ans[1]);

    }
}