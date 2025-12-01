
import java.util.ArrayList;
import java.util.List;

 public class FindConsecutiveSequenceInArray {
 public static int findLongestConsecutiveSequence(int arr[]) {
         int longest = 1;
         for (int i = 0; i < arr.length; i++) {
             int count = 1; //because we have one element 
             int x = arr[i]; // It store the largest element 
             for (int j = 0; j < arr.length; j++) {
                 if (arr[j]==x+1){
                     x = x + 1;
                     count++;
                     // we need to reset the value of j 
                     j=0;
                 }
             }
             longest = Math.max(longest, count);
         }
         return longest;
     }
     public static void main(String args[]) {
         int arr[] = {102, 4, 100, 1, 101, 3, 2, 1};
         int ans = findLongestConsecutiveSequence(arr);
         System.out.println(ans);
     }
 }
 