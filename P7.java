import java.util.*;

public class P7 {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int row = 0;
        int col = 0;
        int maxRow = n;
        int maxCol = m;
        int previous, current;
        while (row < maxRow - 1 && col < maxCol - 1) {
            previous = mat.get(row + 1).get(col);
            for (int i = col; i < maxCol; i++) {
                current = mat.get(row).get(i);// 2
                mat.get(row).set(i, previous);
                previous = current;
            }
            row++;
            for (int i = row; i < maxRow; i++) {
                current = mat.get(i).get(maxCol - 1);
                mat.get(i).set(maxCol - 1, previous);
                previous = current;
            }
            maxCol--;
            if (row < maxRow) {
                for (int i = maxCol - 1; i >= col; i--) {
                    current = mat.get(maxRow - 1).get(i);
                    mat.get(maxRow - 1).set(i, previous);
                    previous = current;
                }
            }
            maxRow--;
            if (col < maxCol) {
                for (int i = maxRow - 1; i >= row; i--) {
                    current = mat.get(i).get(col);
                    mat.get(i).set(col, previous);
                    previous = current;
                }
            }
            col++;
        }
    }
}
