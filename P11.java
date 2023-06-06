import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class P11 {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr.get(i);
            xor = xor ^ (i + 1);
        }
        int pos = (xor & ~(xor - 1));
        int zero = 0;
        int one = 0;
        for (int i = 0; i < n; i++) {
            if ((arr.get(i) & pos) != 0)
                one = one ^ arr.get(i);
            else
                zero = zero ^ arr.get(i);
        }
        for (int i = 1; i <= n; i++) {
            if ((i & pos) != 0)
                one = one ^ i;
            else
                zero = zero ^ i;
        }
        int count = 0;
        for (int a : arr)
            if (zero == a)
                count++;
        if (count == 2)
            return new int[] { one, zero };
        else
            return new int[] { zero, one };

    }
}
