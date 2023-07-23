public class P58 {
    static boolean valid(int[] col, int[][] mat, int c, int node) {
        int m = col.length;
        for (int i = 0; i < m; i++) {
            if (mat[node][i] == 1 && col[i] == c)
                return false;
        }
        return true;
    }

    static boolean sol(int[][] mat, int node, int[] col, int m) {
        if (node == mat.length)
            return true;
        for (int i = 1; i <= m; i++) {
            if (valid(col, mat, i, node)) {
                col[node] = i;
                if (sol(mat, node + 1, col, m))
                    return true;
                col[node] = 0;
            }
        }
        return false;
    }

    public static String graphColoring(int[][] mat, int m) {
        int n = mat.length;
        int col[] = new int[n];
        return sol(mat, 0, col, m) ? "YES" : "NO";
    }
}