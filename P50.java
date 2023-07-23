import java.util.*;
import java.io.*;

public class P50 {
    static ArrayList<ArrayList<Integer>> res;
    static Set<ArrayList<Integer>> set;

    static void sol(int ind, int[] arr, ArrayList<Integer> curr) {
        if (set.add(new ArrayList(curr)))
            res.add(new ArrayList(curr));
        for (int i = ind; i < arr.length; i++) {
            curr.add(arr[i]);
            sol(i + 1, arr, curr);
            curr.remove(curr.size() - 1);
        }
    }

    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        Arrays.sort(arr);
        res = new ArrayList<>();
        set = new HashSet<>();
        sol(0, arr, new ArrayList<>());
        return res;
    }

}
