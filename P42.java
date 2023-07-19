import java.util.ArrayList;

public class P42 {
    public static int longestSubSeg(ArrayList<Integer> arr, int n, int k) {
        int i = 0;
        int j = 0;
        int res = 0;
        while (j < n) {
            if (arr.get(j) == 0)
                k--;
            while (k < 0) {
                if (arr.get(i) == 0)
                    k++;
                i++;
            }
            res = Math.max(res, j - i + 1);
            j++;
        }
        return res;
    }
}
