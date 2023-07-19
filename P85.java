import java.util.*;

public class P85 {
    // Using Costly enqueue operation
    static class Queue {
        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();

        Queue() {
        }

        void enQueue(int val) {
            while (!a.isEmpty())
                b.push(a.pop());
            a.push(val);
            while (!b.isEmpty())
                a.push(b.pop());

        }

        int deQueue() {
            if (a.isEmpty())
                return -1;
            return a.pop();
        }

        int peek() {
            if (a.isEmpty())
                return -1;
            return a.peek();
        }

        boolean isEmpty() {
            return a.isEmpty();
        }
    }
}