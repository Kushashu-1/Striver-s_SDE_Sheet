import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class P3 {

    public static ArrayList<Integer> nextPermutation(ArrayList<Integer> per) {
        int n = per.size();
        int i = n - 1;
        int j = n - 1;
        while (i > 0 && per.get(i) <= per.get(i - 1))
            i--;
        i = i - 1;
        if (i == -1) {
            Collections.reverse(per);
            return per;
        }
        while (j > 0 && per.get(j) <= per.get(i)) {
            j--;
        }

        // Swap i, j
        int temp = per.get(i);
        per.set(i, per.get(j));
        per.set(j, temp);
        // reverse from i+1
        j = n - 1;
        i = i + 1;
        while (i < j) {
            temp = per.get(i);
            per.set(i, per.get(j));
            per.set(j, temp);
            i++;
            j--;
        }
        return per;
    }
}
