import java.io.*;
import java.util.*;

public class P15 {
    public static int findMajority(int[] arr, int n) {
        // Using Moore's Mazority Voting
        int count = 0;
        int candidate = -1000000;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            } else if (candidate == arr[i])
                count++;
            else
                count--;
        }
        count = 0;
        for (int i : arr) {
            if (i == candidate)
                count++;
        }
        return count > (int) Math.floor(n / 2) ? candidate : -1;
    }
}
