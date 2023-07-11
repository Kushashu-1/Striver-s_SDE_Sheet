import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class P171 {
    public static int maximumProduct(ArrayList<Integer> arr, int n) {
        int max = arr.get(0);
        int min = arr.get(0);
        int ans = arr.get(0);
        for (int i = 1; i < n; i++) {
            int f = arr.get(i);
            int s = arr.get(i) * max;
            int t = arr.get(i) * min;
            max = Math.max(Math.max(f, s), t);
            min = Math.min(Math.min(f, s), t);
            ans = Math.max(ans, max);
        }
        return ans;
    }
}