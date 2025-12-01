
// exmaple one brute force method 
// public class MaximumSumOfSubArray{
//     public static int  printMaxSubArray(int arr[]){
//         // This approach is brute force and having a time complexity is O(n3)
//         int arrl=arr.length; 
//         int maximum=Integer.MIN_VALUE;
//         int start = 0 , end = 0 ; 
//         for(int i = 0 ; i<arrl; i++){
//             for(int j=i ; j<arrl; j++){
//                 int sum = 0 ; 
//                 // it will iterate over the subArray
//                 for(int k =i; k<=j ; k++){
//                     sum+=arr[k];
//                     maximum=Math.max(maximum,sum);
//                 }
//             }
//         }
//         return maximum;
//     }
//     public static void main (String args[]){
//          int arr[]={-2,-3,4,-1,-2,1,5,-3};
// int ans=printMaxSubArray(arr);
//     System.out.println(ans);
//     }
// }
// example 2 : more optimal brute force 
// public class MaximumSumOfSubArray{
//     public static int  printMaxSubArray(int arr[]){
//         // This approach is brute force and having a time complexity is O(n3)
//         int arrl=arr.length; 
//         int maximum=Integer.MIN_VALUE;
//         int start = 0 , end = 0 ; 
//         for(int i = 0 ; i<arrl; i++){
//             int sum = 0 ; 
//             for(int j=i ; j<arrl; j++){
//     // it will add the sum at every time in the maxium              
//                     sum+=arr[j];
//                     maximum=Math.max(sum,maximum);
//             }
//         }
//         return maximum;
//     }
//     public static void main (String args[]){
//          int arr[]={-2,-3,4,-1,-2,1,5,-3};
// int ans=printMaxSubArray(arr);
//     System.out.println(ans);
//     }
// }
// third approach optimal approach 
// public class MaximumSumOfSubArray{
//     public static int  printMaxSubArray(int arr[]){
// int sum = 0 ; 
// int maximum=Integer.MIN_VALUE;
//         for(int i = 0 ; i<arr.length ; i++){
//             // If our sum is in negative then we again set the sum to  zero 
//             if(sum<0){
//                 sum=0; 
//             }
//             // Otherwise 
//             else {
//                 sum+=arr[i];
//                 maximum=Math.max(sum,maximum);
//             }
//         }
//  return maximum; 
//     }
//     public static void main (String args[]){
//          int arr[]={-2,-3,4,-1,-2,1,5,-3};
//        int ans = printMaxSubArray(arr);
//        System.out.println(ans);
//     }
// }
// example 4 : print the maximum sum and also its subArray 
public class MaximumSumOfSubArray {

    public static int printMaxSubArray(int arr[]) {

        int sum = 0;
        int maximum = Integer.MIN_VALUE;
        int start = 0, ansStart = -1, ansEnd = -1;
        for (int i = 0; i < arr.length; i++) {

            // it value always change when the sum is zero 
            if (sum == 0) {
                start = i;
            }
            // If our sum is in negative then we again set the sum to  zero 
            if (sum < 0) {
                sum = 0;
            } // Otherwise 
            else {
                sum += arr[i];
                maximum = Math.max(sum, maximum);
                ansStart = start;
                ansEnd = i;

            }
        }

        for (int i = start; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }

        return maximum;

    }

    public static void main(String args[]) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int ans = printMaxSubArray(arr);

        System.out.print("\n");
        System.out.println("The Maximum Sum is :" + ans);

    }
}
