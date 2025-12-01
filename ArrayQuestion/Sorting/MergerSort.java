
public class MergerSort {

    public static void conquer(int arr[], int startIndex, int mid, int endingIndex) {
        int merger[] = new int[endingIndex - startIndex + 1];

        // index one track first array 
        int idx1 = startIndex;
        // index two track second array 
        int idx2 = mid + 1;
        // new array trace 
        int x = 0;

        // comparison and insert 
        while (idx1 <= mid && idx2 <= endingIndex) {
            // case where arr[idex2] is bigger
            if (arr[idx1] < arr[idx2]) {
                // then we put the smalle in merger array 
                merger[x] = arr[idx1];
                x++;
                idx1++;
            } // case where arr[idx1] is bigger 
            else {
                merger[x] = arr[idx2];
                x++;
                idx2++;
            }
        }

        while (idx1 <= mid) {
            merger[x++] = arr[idx1++];
        }

        while (idx2 <= endingIndex) {
            merger[x++] = arr[idx2++];
        }

        // copy the merget array into original array 

        for(int i = 0 , j=startIndex ; i<merger.length ; i++,j++){
            arr[j]=merger[i];

        }

    }

    public static void divide(int arr[], int startIndex, int endingIndex) {

        if (startIndex >= endingIndex) {
            return;
        }

        int mid;
        mid = (startIndex + endingIndex) / 2;
        divide(arr, startIndex, mid);
        divide(arr, mid + 1, endingIndex);

        // after that it will run this after divide the element single single 
        conquer(arr, startIndex, mid, endingIndex);

    }

    public static void main(String args[]) {

        int arr[]={4,2,9,45,12};
        int n = arr.length; 
        divide(arr,0,n-1);

        //print 
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
