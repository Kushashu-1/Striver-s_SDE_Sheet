import java.util.*;
import java.io.*;

public class P55 {
    static List<String> res;

    // Swap->Move forward ->Swap
    static String swap(String s, int i, int j) {
        char[] c = s.toCharArray();
        char t = c[i];
        c[i] = c[j];
        c[j] = t;
        return new String(c);
    }

    static void solver(String s, int i) {
        if (i == s.length() - 1)
            res.add(s);
        for (int k = i; k < s.length(); k++) {
            s = swap(s, i, k);
            solver(s, i + 1);
            s = swap(s, i, k);
        }
    }

    public static List<String> findPermutations(String s) {
        res = new ArrayList<>();
        solver(s, 0);
        return res;
    }
}
