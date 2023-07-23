import java.util.*;

public class P52 {
    static ArrayList<ArrayList<Integer>> res;

    static void sol(ArrayList<Integer> arr, int ind, int t, ArrayList<Integer> curr) {
        if (t == 0) {
            res.add(new ArrayList(curr));
            return;
        }
        if (t < 0)
            return;
        for (int i = ind; i < arr.size(); i++) {
            if (i > ind && arr.get(i) == arr.get(i - 1))
                continue;
            if (arr.get(i) > t)
                break;
            if (arr.get(i) <= t) {
                curr.add(arr.get(i));
                sol(arr, i + 1, t - arr.get(i), curr);
                curr.remove(curr.size() - 1);
            }

        }
    }

    public static ArrayList<ArrayList<Integer>> combinationSum2(ArrayList<Integer> arr, int n, int t) {
        Collections.sort(arr);
        res = new ArrayList<>();
        sol(arr, 0, t, new ArrayList<>());
        return res;
    }
}