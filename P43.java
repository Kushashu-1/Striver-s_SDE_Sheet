import java.util.*;
import java.io.*;

public class P43 {
    public static List<Integer> maximumMeetings(int[] start, int[] end) {
        int n = start.length;
        int[][] pair = new int[n][3];
        for (int i = 0; i < n; i++) {
            pair[i][0] = start[i];
            pair[i][1] = end[i];
            pair[i][2] = i + 1;
        }
        Arrays.sort(pair, (a, b) -> a[1] - b[1]);
        int last = pair[0][1];
        ArrayList<Integer> res = new ArrayList<>();
        res.add(pair[0][2]);
        for (int i = 1; i < n; i++) {
            if (pair[i][0] > last) {
                last = pair[i][1];
                res.add(pair[i][2]);
            }
        }
        return res;

    }
}
