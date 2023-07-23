import java.util.*;
import java.io.*;

public class P59 {
    static ArrayList<ArrayList<Integer>> res;

    static void sol(int[][] maze, int i, int j, int n, int[][] vis) {
        int[][] dir = { { 0, -1 }, { -1, 0 }, { 1, 0 }, { 0, 1 } };
        if (i == n - 1 && j == n - 1) {
            addres(vis);
        }
        for (int[] d : dir) {
            int x = i + d[0];
            int y = j + d[1];
            if (x >= n || x < 0 || y < 0 || y >= n || vis[x][y] == 1 || maze[x][y] == 0)
                continue;
            vis[x][y] = 1;
            sol(maze, x, y, n, vis);
            vis[x][y] = 0;
        }
    }

    static void addres(int[][] vis) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int[] vi : vis)
            for (int v : vi)
                temp.add(v);
        res.add(temp);
        return;
    }

    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {
        int[][] vis = new int[n][n];
        res = new ArrayList<>();
        vis[0][0] = 1;
        sol(maze, 0, 0, n, vis);
        return res;
    }
}
