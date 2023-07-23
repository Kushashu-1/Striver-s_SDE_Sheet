import java.util.*;

public class P95 {

    public static int minTimeToRot(int[][] grid, int n, int m) {
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2)
                    q.add(new int[] { i, j });
                else if (grid[i][j] == 1)
                    fresh++;
            }
        }
        if (fresh == 0)
            return 0;
        int res = 0;
        int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                for (int[] d : dir) {
                    int dx = d[0] + curr[0];
                    int dy = d[1] + curr[1];
                    if (dx < 0 || dy < 0 || dx > grid.length - 1 || dy > grid[0].length - 1 || grid[dx][dy] != 1)
                        continue;
                    grid[dx][dy] = 2;
                    fresh--;
                    q.add(new int[] { dx, dy });
                }
            }
            res++;
        }
        return fresh == 0 ? res - 1 : -1;
    }

}