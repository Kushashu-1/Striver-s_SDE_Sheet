import java.util.*;
import java.io.*;

public class P45 {
    public static int jobScheduling(int[][] jobs) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int[] j : jobs)
            pq.add(j);
        int n = jobs.length;
        int[] slot = new int[n + 1];
        int res = 0;
        while (!pq.isEmpty()) {
            int[] c = pq.poll();
            for (int i = Math.min(n, c[0]); i > 0; i--) {
                if (slot[i] == 0) {
                    slot[i] = 1;
                    res += c[1];
                    break;
                }
            }
        }
        return res;

    }
}
