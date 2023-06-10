import java.util.*;
import java.io.*;

public class P39 {

    public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int k = 0; k < n; k++) {
            if (k == 0 || (arr[k] != arr[k - 1])) {
                int t = K - arr[k];
                int i = k + 1;
                int j = n - 1;
                while (i < j) {
                    if (arr[i] + arr[j] == t) {
                        ArrayList<Integer> temp = new ArrayList<Integer>();
                        temp.add(arr[k]);
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        res.add(temp);
                        while (i < n - 1 && arr[i] == arr[i + 1])
                            i++;
                        while (j > 1 && arr[j] == arr[j - 1])
                            j--;

                        i++;
                        j--;
                    } else if (arr[i] + arr[j] > t)
                        j--;
                    else
                        i++;
                }
            }
        }
        return res;
    }
}
