import java.io.*;
import java.util.*;

import java.util.ArrayList;

public class P23 {
    public static int using_space(ArrayList<Integer> t, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int x = 0;
        int res = 0;

        for (int i = 0; i < t.size(); i++) {
            x = x ^ t.get(i);
            int xk = x ^ k;
            if (hm.containsKey(xk))
                res = res + hm.get(xk);
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        return res;
    }

    public static int brute_force(ArrayList<Integer> t, int x) {
        int[] prefix_xor = new int[t.size() + 1];
        prefix_xor[0] = 0;

        for (int i = 0; i < t.size(); i++) {
            prefix_xor[i + 1] = prefix_xor[i] ^ t.get(i);
        }
        // System.out.println(Arrays.toString(prefix_xor));
        int res = 0;
        for (int i = 0; i < t.size() + 1; i++) {
            for (int j = i + 1; j < t.size() + 1; j++) {
                if ((prefix_xor[j] ^ prefix_xor[i]) == x)
                    res++;
            }
        }
        return res;
    }

    public static int subarraysXor(ArrayList<Integer> t, int x) {
        // return brute_force(t,x);
        return using_space(t, x);
    }
}