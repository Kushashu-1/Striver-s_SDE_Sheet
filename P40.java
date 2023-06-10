import java.util.*;
import java.io.*;

public class P40 {
    public static long using_space(long[] arr, int n) {
        // Monotonic Stack Solution
        Stack<Integer> stk = new Stack<>();
        long res = 0;
        for (int i = 0; i < n; i++) {
            while (!stk.isEmpty() && arr[stk.peek()] <= arr[i]) {
                int rm = i;
                long curr = arr[stk.pop()];
                if (stk.isEmpty())
                    break;
                int lm = stk.peek();
                int width = rm - lm - 1;
                res += (width * (Math.min(arr[rm], arr[lm]) - curr));
            }
            stk.push(i);
        }
        return res;
    }

    public static long two_pointer(long[] arr, int n) {
        long ans = 0;
        int i = 0;
        int j = n - 1;
        long lm = 0;
        long rm = 0;
        while (i <= j) {
            if (arr[i] <= arr[j]) {
                lm = Math.max(arr[i], lm);
                ans += (lm - arr[i]);
                i++;
            } else {
                rm = Math.max(rm, arr[j]);
                ans += (rm - arr[j]);
                j--;
            }
        }
        return ans;
    }

    public static long getTrappedWater(long[] arr, int n) {
        // return using_space(arr,n);
        return two_pointer(arr, n);
    }
}
