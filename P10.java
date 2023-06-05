import java.io.*;
import java.util.*;

import java.util.ArrayList;

public class P10 {
    public int using_space(ArrayList<Integer> arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr)
            if (!set.add(i))
                return i;
        return -1;
    }

    public static int without_space(ArrayList<Integer> arr, int n) {
        // Cycle Method
        for (int i = 0; i < arr.size(); i++) {
            int temp = (int) Math.abs(arr.get(i));
            if (arr.get(temp - 1) < 0)
                return temp;
            else {
                arr.set(temp - 1, arr.get(temp - 1) * -1);
            }
        }
        return -1;

    }

    public static int findDuplicate(ArrayList<Integer> arr, int n) {
        // return using_space(arr);
        return without_space(arr, n);
    }
}
