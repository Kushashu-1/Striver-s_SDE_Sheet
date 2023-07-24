import java.util.*;
import java.io.*;

class node {
    int val;
    int min;

    node(int val, int min) {
        this.val = val;
        this.min = min;
    }
}

public class P94 {

    static class MinStack {

        Stack<node> stk = new Stack<>();

        MinStack() {

        }

        // Function to add another element equal to num at the top of stack.
        void push(int num) {
            if (stk.isEmpty())
                stk.push(new node(num, num));
            else
                stk.push(new node(num, Math.min(stk.peek().min, num)));
        }

        // Function to remove the top element of the stack.
        int pop() {
            if (stk.isEmpty())
                return -1;
            return stk.pop().val;
        }

        // Function to return the top element of stack if it is present. Otherwise
        // return -1.
        int top() {
            if (stk.isEmpty())
                return -1;
            return stk.peek().val;
        }

        // Function to return minimum element of stack if it is present. Otherwise
        // return -1.
        int getMin() {
            if (stk.isEmpty())
                return -1;
            return stk.peek().min;
        }
    }
}