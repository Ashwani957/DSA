
import java.util.ArrayList;
import java.util.List;

public class Permutationtwo {

    private static void recurePermutation(int nums[], List<List<Integer>> ans, List<Integer> ds, boolean freq[]) {
        // Base condition 
        if (ds.size() == nums.length) {
            ans.add(new ArrayList(ds));
            return;
        }

        // iterate the whole array 
        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                // add the current value at the ds 
                ds.add(nums[i]);
                //  next recursive call 
                recurePermutation(nums, ans, ds, freq);

                // Backtracking start Here 
                // remove the element from the stack 
                ds.remove(ds.size() - 1);
                // set the element value false at particular index 

                freq[i] = false;

            }

        }

    }

    public static List<List<Integer>> permute(int nums[]) {
        // store the arrayList 
        List<List<Integer>> ans = new ArrayList<>();
        // store the temporarry value 
        List<Integer> ds = new ArrayList<>();
        // Boolean array that store the track value that are used or not 
        boolean freq[] = new boolean[nums.length];
        recurePermutation(nums, ans, ds, freq);
        return ans;

    }

    public static void main(String args[]) {

        Permutationtwo prtwo = new Permutationtwo();
        List<List<Integer>> ans = prtwo.permute(new int[]{1, 2, 3});

        for (List<Integer> list : ans) {
            System.out.println("[" + list + "]");
        }

    }
}

// similar logic for the string 