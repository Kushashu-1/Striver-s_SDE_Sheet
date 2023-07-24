import java.util.*;
import java.io.*;

public class P87 {

    public static int[] nextGreater(int[] arr, int n) {
        Stack<Integer> stk = new Stack<>();
        int[] res = new int[n];
        Arrays.fill(res, -1);
        for (int i = 0; i < n; i++) {
            while (!stk.isEmpty() && arr[stk.peek()] < arr[i]) {
                int p = stk.pop();
                res[p] = arr[i];
            }
            stk.push(i);
        }
        return res;
    }

}
