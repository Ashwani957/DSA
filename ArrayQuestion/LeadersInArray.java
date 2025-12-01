
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// public class LeadersInArray {
//     public static List<Integer> leaders(int arr[]) {
//         ArrayList<Integer> leaderList = new ArrayList<>();
//         for (int i = 0; i < arr.length; i++) {
//             boolean leader = true;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] > arr[i]) {
//                     leader = false;
//                     break;
//                 } 
//             }
//             // add the leaders 
//             if(leader){
//                 leaderList.add(arr[i]);
//             }
//         }
//        return leaderList;
//     }
//     public static void main(String args[]) {
//         int arr[] = {16, 17, 4, 3, 5, 2};
//         List<Integer> leaderList = leaders(arr);
//         System.out.println(Arrays.toString(leaderList.toArray()));
//     }
// }
// optimal leaders 
public class LeadersInArray {

    public static List<Integer> leaders(int arr[]) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
// Back tracking Done Here 
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > max) {
                ans.add(arr[i]);
            }
            max = Math.max(max, arr[i]);
        }
        return ans;

    }

    public static void main(String args[]) {

        int arr[] = {16, 17, 4, 3, 5, 2};
        List<Integer> leaderList = leaders(arr);
        leaderList = leaderList.stream().sorted((a, b) -> b - a).collect(Collectors.toList());
        System.out.println(leaderList);

    }
}
