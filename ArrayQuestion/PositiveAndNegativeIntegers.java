public class PositiveAndNegativeIntegers{


    public static void rearrange(int array[]){
        int i=0 , j = array.length;
         while (i<j){
            if(array[i]<0 && array[i]<array[j]){
                 int temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp; 
            }
            else {
                i++;
            }
         }
    }


    public static void main (String args[]){
        int array[]={-1,2,4,-3,6,-8};
    }
}

