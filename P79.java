import java.util.*;
import java.io.*;

public class P79 {
    static ArrayList<ArrayList<Integer>> res;

    static void sol(ArrayList<Integer> arr, int ind, ArrayList<Integer> c) {
        res.add(new ArrayList(c));
        for (int i = ind; i < arr.size(); i++) {
            c.add(arr.get(i));
            sol(arr, i + 1, c);
            c.remove(c.size() - 1);
        }
    }

    public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
        res = new ArrayList<>();
        sol(arr, 0, new ArrayList<>());
        return res;
    }
}
