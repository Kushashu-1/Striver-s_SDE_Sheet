import java.util.*;
import java.io.*;

public class P17 {
    public static int dfs_memo(int m, int n, int x, int y, int[][] memo) {
        if (x == m - 1 && y == n - 1)
            return 1;
        if (x >= m || y >= n)
            return 0;
        if (memo[x][y] != -1)
            return memo[x][y];
        return memo[x][y] = dfs_memo(m, n, x + 1, y, memo) + dfs_memo(m, n, x, y + 1, memo);
    }

    public static int dp_sol(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 1;
                else
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

    public static int formula(int m, int n) {
        // ncr
        int res = 1;
        int N = m + n - 2;
        int r = m - 1;
        for (int i = 0; i < r; i++) {
            res = res * (N - i) / (i + 1);
        }
        return res;
    }

    public static int uniquePaths(int m, int n) {
        // Formula
        // return formula(m,n);
        // Memoized DFS
        // int[][] memo = new int[m][n];
        // for(int[] a : memo)
        // Arrays.fill(a,-1);
        // return dfs_memo(m,n,0,0,memo);
        //
        // DP solution
        return dp_sol(m, n);
    }
}