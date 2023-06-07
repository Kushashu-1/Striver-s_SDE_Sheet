import java.io.*;
import java.util.*;

import java.util.ArrayList;

public class P22 {

    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
        // Using Prefix Sum and HashMap
        HashMap<Long, Integer> hm = new HashMap<>();
        int ans = 0;
        long sum = 0;
        hm.put(0L, 0);
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (hm.containsKey(sum)) {
                ans = Math.max(ans, (i + 1) - hm.get(sum));
            } else
                hm.put(sum, i + 1);
        }
        return ans;
    }
}