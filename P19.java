import java.io.*;
import java.util.*;

public class P19 {
    public static List<int[]> brute_force(int[] arr, int s) {
        ArrayList<int[]> res = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == s) {
                    res.add(new int[] { arr[i], arr[j] });
                } else if (arr[i] + arr[j] > s)
                    j = arr.length;
            }
        }
        return res;
    }

    public static List<int[]> using_space(int[] arr, int s) {
        ArrayList<int[]> res = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int a : arr)
            hm.put(a, hm.getOrDefault(a, 0) + 1);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(s - arr[i])) {
                int count = hm.get(s - arr[i]);
                for (int j = 0; j < count; j++)
                    res.add(new int[] { arr[i], s - arr[i] });
                hm.remove(arr[i]);
            }
        }
        return res;
    }

    public static List<int[]> pairSum(int[] arr, int s) {
        return brute_force(arr, s);
        // return using_space(arr,s);
    }
}
