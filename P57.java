public class P57 {
    static boolean valid(int matrix[][], int r, int c, int val) {
        for (int i = 0; i < 9; i++)
            if (matrix[r][i] == val || matrix[i][c] == val)
                return false;
        r = (r / 3) * 3;
        c = (c / 3) * 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (matrix[i][j] == val)
                    return false;
            }
        }
        return true;
    }

    static boolean sol(int[][] mat, int r, int c) {
        if (r == 8 && c == 9)
            return true;
        else {
            if (c == 9) {
                r++;
                c = 0;
            }
        }
        if (mat[r][c] != 0)
            return sol(mat, r, c + 1);
        if (mat[r][c] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (valid(mat, r, c, i)) {
                    mat[r][c] = i;
                    if (sol(mat, r, c + 1))
                        return true;
                }
                mat[r][c] = 0;
            }
        }
        return false;

    }

    public static boolean isItSudoku(int matrix[][]) {
        return sol(matrix, 0, 0);
    }
}
