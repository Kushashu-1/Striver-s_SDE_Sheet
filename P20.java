import java.io.*;
import java.util.*;

public class P20 {
    public static String fourSum(int[] arr, int target, int n) {
        Arrays.sort(arr);
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                int new_target = target - arr[i] - arr[j];
                int k = j + 1;
                int p = n - 1;
                while (k < p) {
                    if (arr[k] + arr[p] == new_target)
                        return "Yes";
                    else if (arr[k] + arr[p] > new_target)
                        p--;
                    else
                        k++;
                }
            }
        return "No";
    }
}
