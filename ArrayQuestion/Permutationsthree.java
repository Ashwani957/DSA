
import java.util.ArrayList;
import java.util.List;

public class Permutationsthree {

    private void recurePermutation(int index, int nums[], List<List<Integer>> ans) {
        // Base Condition 
        if (index == nums.length) {
            // this ds will store the list of permute element 
            List<Integer> ds = new ArrayList<>();
            // loop the nums array and add it into ds 
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            // after adding the all element to the list of ds then we add the particular ds list to ans list 
            ans.add(new ArrayList(ds));
            return;

        }

        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);

            // Here we have index abse swapping in every iteration we change the value of index 
            recurePermutation(index + 1, nums, ans);
            // for backtracking we should again swap it 
            //         i=1 → swap(0,1) → [2,1,3]
            //     recurse
            // // swap back → [1,2,3]

            swap(i, index, nums);
        }

    }

    // swapping the element 
    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // method that recurete 
    public List<List<Integer>> permute(int nums[]) {
        List<List<Integer>> ans = new ArrayList<>();
        recurePermutation(0, nums, ans);
        return ans;

    }

    public static void main(String args[]) {

        Permutationsthree prthree = new Permutationsthree();
        List<List<Integer>> ans = prthree.permute(new int[]{1, 2, 3});

        for (List<Integer> an : ans) {

            System.out.print(an);

        }

    }
}
