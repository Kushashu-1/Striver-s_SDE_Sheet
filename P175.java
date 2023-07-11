
public class P175 {

    public static int editDistance(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= m; i++)
            dp[0][i] = i;
        for (int i = 0; i <= n; i++)
            dp[i][0] = i;
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++) {
                if (s2.charAt(i - 1) == s1.charAt(j - 1))
                    dp[i - 1][j - 1]--;
                dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i - 1][j - 1], dp[i][j - 1])) + 1;
            }
        return dp[n][m];
    }
}