import java.util.*;

public class P152 {

    static PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> min = new PriorityQueue<>();

    static void put(int num) {
        if (max.isEmpty() || max.peek() >= num)
            max.add(num);
        else
            min.add(num);
        if (max.size() > min.size() + 1) {
            min.add(max.poll());
        }
        if (max.size() < min.size())
            max.add(min.poll());
    }

    static int median() {
        if (max.size() == min.size())
            return (max.peek() + min.peek()) / 2;
        else
            return max.peek();

    }

    public static int[] findMedian(int[] arr, int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            put(arr[i]);
            res[i] = median();
        }
        // As here single object is used to solve multiple testcases
        // every time we have to Clear priorityQueues
        max.clear();
        min.clear();
        return res;
    }
}
