import java.util.*;
import java.io.*;

public class P89 {
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n) {
        Stack<Integer> stk = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++)
            res.add(-1);
        for (int i = 0; i < n; i++) {
            while (!stk.isEmpty() && arr.get(stk.peek()) > arr.get(i)) {
                res.set(stk.pop(), arr.get(i));
            }
            stk.push(i);
        }
        return res;
    }
}