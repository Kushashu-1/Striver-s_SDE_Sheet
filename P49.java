import java.util.*;
import java.io.*;

public class P49 {
    static ArrayList<Integer> res;

    static void dfs(int[] nums, int ind, int curr) {
        res.add(curr);
        for (int i = ind; i < nums.length; i++) {
            curr += nums[i];
            dfs(nums, i + 1, curr);
            curr -= nums[i];
        }
    }

    public static ArrayList<Integer> subsetSum(int nums[]) {
        res = new ArrayList<>();
        dfs(nums, 0, 0);
        Collections.sort(res);
        return res;
    }

}