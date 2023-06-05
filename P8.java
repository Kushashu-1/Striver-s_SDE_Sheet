import java.util.*;
import java.io.*;
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class P8 {
    public static List<Interval> mergeIntervals(Interval[] ins) {
        ArrayList<Interval> stk = new ArrayList();
        Arrays.sort(ins, (a, b) -> a.start - b.start);
        stk.add(ins[0]);
        for (int i = 1; i < ins.length; i++) {
            Interval temp = stk.get(stk.size() - 1);
            if (ins[i].start <= temp.finish) {
                stk.remove(stk.size() - 1);
                temp.finish = Math.max(ins[i].finish, temp.finish);
                stk.add(temp);
            } else {
                stk.add(ins[i]);
            }
        }
        return stk;
    }
}
