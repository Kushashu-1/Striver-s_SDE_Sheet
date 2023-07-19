import java.util.*;

public class P84 {
    static class Stack {
        Queue<Integer> q = new LinkedList<>();

        public Stack() {

        }

        /*----------------- Public Functions of Stack -----------------*/

        public int getSize() {
            return q.size();
        }

        public boolean isEmpty() {
            return q.isEmpty();
        }

        public void push(int element) {
            int size = q.size();
            q.offer(element);
            while (size-- != 0) {
                q.offer(q.poll());
            }

        }

        public int pop() {
            if (q.isEmpty())
                return -1;
            return q.poll();
        }

        public int top() {
            if (q.isEmpty())
                return -1;
            return q.peek();
        }
    }
}