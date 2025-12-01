
import java.util.ArrayList;
import java.util.List;

class Solution {

    private void recurePermutation(int[] nums, List<List<Integer>> ans, List<Integer> ds, boolean[] freq) {

        // Base condition ->where permutation complete 
        if (ds.size() == nums.length) {
            // ds is a local that contain the all permutaiton 
            ans.add(new ArrayList<>(ds));
            return;
        }

        // try all number 
        for (int i = 0; i < nums.length; i++) {

            if (!freq[i]) {

                // marked Used this position 
                freq[i] = true;
                ds.add(nums[i]);

                // Recursive call 
                recurePermutation(nums, ans, ds, freq);

                // Backtracking  it will execute at last when all things are done 
                ds.remove(ds.size() - 1); // remove the element form the temporary storage 
                freq[i] = false;
            }
        }
    }

    public List<List<Integer>> permute(int nums[]) {
        // It will store all the permutation 
        List<List<Integer>> ans = new ArrayList<>();
        //it store all the temporary data 
        List<Integer> ds = new ArrayList<>();
        // it will store the boollean value that partiucalr value is used or not 
        boolean freq[] = new boolean[nums.length];
        recurePermutation(nums, ans, ds, freq);
        return ans;

    }
}

public class Permutation {

    public static void main(String args[]) {
        Solution sol = new Solution();
        List<List<Integer>> ans = sol.permute(new int[]{1, 2, 3});

        for (List<Integer> list : ans) {
            System.out.println("[" + list + "]"
               
                
                );
        }
    }
}
