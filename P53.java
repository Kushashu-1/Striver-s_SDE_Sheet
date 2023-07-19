import java.util.*;
import java.io.*;

public class P53 {
    static List<List<String>> res;

    static boolean isp(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j)
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        return true;
    }

    static void solver(String s, int i, int j, ArrayList<String> temp) {
        if (i == j) {
            res.add(new ArrayList(temp));
        }
        for (int k = i; k < j; k++) {
            String str = s.substring(i, k + 1);
            if (isp(str)) {
                temp.add(str);
                solver(s, k + 1, j, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static List<List<String>> partition(String s) {
        res = new ArrayList<>();
        solver(s, 0, s.length(), new ArrayList<>());
        return res;
    }
}