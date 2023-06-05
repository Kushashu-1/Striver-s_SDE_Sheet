import java.io.*;
import java.util.*;

import java.util.ArrayList;

public class P2 {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> arr = new ArrayList<>();
        ArrayList<Long> temp = new ArrayList<>();
        temp.add(1L);
        arr.add(temp);
        for (int i = 1; i < n; i++) {
            temp = new ArrayList<>();
            temp.add(1L);
            for (int j = 1; j < i; j++) {
                temp.add(arr.get(i - 1).get(j - 1) + arr.get(i - 1).get(j));
            }
            temp.add(1L);
            arr.add(temp);
        }
        return arr;
    }
}
