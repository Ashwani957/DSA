
import java.util.List;
import java.util.ArrayList;

public class CountInversion {

    public static List<List<Integer>> countInverseion(int arr[], int n) {

        int count = 0;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            // always compare with forward element not backward element 

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    count++;
                    List<Integer> list = new ArrayList<>();
                    list.add(j);
                    list.add(i);
                    ans.add(list);
                }
            }

        }
        System.out.println("Count will be +" + count);
        return ans;
    }

    public static void main(String args[]) {
        int arr[] = {5, 3, 2, 4, 1};
        int n = arr.length;
        List<List<Integer>> ans = countInverseion(arr, n);
        System.out.println(ans);

    }
}
