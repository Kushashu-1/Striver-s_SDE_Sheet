import java.io.*;
import java.util.*;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) {
        // Moore's Voting Algo
        // as count>N/3 required at max 2 candidates possible
        int n = arr.size();
        int count1 = 0;
        int candidate1 = -1;
        int count2 = 0;
        int candidate2 = -1;
        for (int i = 0; i < n; i++) {
            int temp = arr.get(i);
            if (temp == candidate1)
                count1++;
            else if (temp == candidate2)
                count2++;
            else if (count1 == 0) {
                candidate1 = temp;
                count1++;
            } else if (count2 == 0) {
                candidate2 = temp;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int a : arr) {
            if (a == candidate1)
                count1++;
            else if (a == candidate2)
                count2++;
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (count1 > (n / 3))
            res.add(candidate1);
        if (count2 > (n / 3))
            res.add(candidate2);
        return res;
    }
}