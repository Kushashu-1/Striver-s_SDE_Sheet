import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class P176 {
    public static int maxIncreasingDumbbellsSum(ArrayList<Integer> rack, int n) {
        int[] dp = new int[n];
        for (int i = 0; i < n; i++)
            dp[i] = rack.get(i);
        int res = dp[0];
        for (int i = 0; i < n; i++)
            for (int j = i - 1; j >= 0; j--) {
                if (rack.get(i) > rack.get(j))
                    dp[i] = Math.max(dp[i], dp[j] + rack.get(i));
                res = Math.max(dp[i], res);
            }
        return res;

    }
}