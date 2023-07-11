import java.util.*;

public class P173 {
    // memoized recursion
    static int memo_rec(int[][] memo, char[] s, char[] t, int n, int m) {
        if (n <= 0 || m <= 0)
            return 0;
        if (memo[n][m] != -1)
            return memo[n][m];
        int cal = 0;
        if (s[n - 1] == t[m - 1])
            cal = 1 + memo_rec(memo, s, t, n - 1, m - 1);
        else
            cal = Math.max(memo_rec(memo, s, t, n - 1, m), memo_rec(memo, s, t, n, m - 1));
        return memo[n][m] = cal;
    }

    static int tabulation(int[][] tab, char[] s, char[] t, int n, int m) {
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++) {
                if (s[i - 1] == t[j - 1])
                    tab[i][j] = 1 + tab[i - 1][j - 1];
                else
                    tab[i][j] = Math.max(tab[i - 1][j], tab[i][j - 1]);
            }
        return tab[n][m];
    }

    public static int lcs(String st, String tt) {
        char[] s = st.toCharArray();
        char[] t = tt.toCharArray();
        int n = s.length;
        int m = t.length;
        int[][] memo = new int[n + 1][m + 1];
        // for(int[] me : memo)
        // Arrays.fill(me,-1);
        // return memo_rec(memo,s,t,n,m);
        return tabulation(memo, s, t, n, m);
    }

}
