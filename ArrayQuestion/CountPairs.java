public class CountPairs{
    public static int countpairs(int arr[],int target){
            int counter= 0 ,i=0; 

            for( i = 0 ; i<arr.length;i++){
                for(int j = i+1 ; j<arr.length; j++){
                    if(arr[i]+arr[j]==target){
                        counter++;
                        i++;
                    }
                }
            }

            return counter;
        

    }
    public static void main (String args[]){

        int arr[]={1,5,7,1,5};
        int target=6; 
      int ans=  countpairs(arr,target);
      System.out.println(ans);



    }
}
 