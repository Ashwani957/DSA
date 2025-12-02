
// import java.util.ArrayList;
// import java.util.List;
//  public class FindConsecutiveSequenceInArray {
//  public static int findLongestConsecutiveSequence(int arr[]) {
//          int longest = 1;
//          for (int i = 0; i < arr.length; i++) {
//              int count = 1; //because we have one element 
//              int x = arr[i]; // It store the largest element 
//              for (int j = 0; j < arr.length; j++) {
//                  if (arr[j]==x+1){
//                      x = x + 1;
//                      count++;
//                      // we need to reset the value of j 
//                      j=0;
//                  }
//              }
//              longest = Math.max(longest, count);
//          }
//          return longest;
//      }
//      public static void main(String args[]) {
//          int arr[] = {102, 4, 100, 1, 101, 3, 2, 1};
//          int ans = findLongestConsecutiveSequence(arr);
//          System.out.println(ans);
//      }
//  }
// Better approach 
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Arrays;
// public class FindConsecutiveSequenceInArray {
//     public static int findLongestConsecutiveSequence(int arr[]) {
//         int longest=1 , count=0, lastSmaller=Integer.MIN_VALUE;
//         // this loop will take the O(n)
//         for(int i = 0 ; i<arr.length ; i++){
//             //Condition check whether previous element continue h ki nahi 
//             // 5-1=4
//           if(arr[i]-1==lastSmaller){
//             count++;
//             lastSmaller=arr[i];
//           }
//           else if (arr[i]!=lastSmaller){
//             count=1; 
//             lastSmaller=arr[i];
//           }
//          longest= Math.max(longest,count);
//         }
//         return longest; 
//     }
//     public static void main(String args[]) {
//         int arr[] = {100,102,100,101,101,4,3,2,3,2,1,1,1,2,103,104,105};
//         Arrays.sort(arr); // inbuilt function time complexity we have O(nlogn)
//          int ans = findLongestConsecutiveSequence(arr);
//          System.out.println("Max Consecutive :"+ans);
//         System.out.println(Arrays.toString(arr));
//     }
// }
// optimal solution 
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;

public class FindConsecutiveSequenceInArray {

    public static int findLongestConsecutiveSequence(int arr[]) {
        int longest = 1;

        HashSet<Integer> hs = new HashSet<>();
        for (int x : arr) {
            hs.add(x);
        }

        for (int y : hs) {
            if (!hs.contains(y - 1)) {
                int count = 1;
                int x = y;// starting element are know x 
                while (hs.contains(x + 1)) {
                    count++;
                    x++;
                }
                longest = Math.max(longest, count);

            }

        }

        return longest;

    }

    public static void main(String args[]) {
        int arr[] = {100, 102, 100, 101, 101, 4, 3, 2, 3, 2, 1, 1, 1, 2, 103, 104, 105};

        int ans = findLongestConsecutiveSequence(arr);

        System.out.println(ans);

    }
}

// Total time complexity 
// sorting time complexity : O(nlogn)
//and loop time complexity : O(n)
// total time complexity : O(nlogn)+O(n)=O(nlogn)
