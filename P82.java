public class P82 {
    static class Stack {
        int[] arr = new int[1001];
        int s = 0;
        int top = -1;

        Stack(int c) {
            s = c - 1;
        }

        public void push(int num) {
            if (top == s)
                return;
            arr[++top] = num;
        }

        public int pop() {
            if (top == -1)
                return -1;
            return arr[top--];
        }

        public int top() {
            if (top == -1)
                return -1;
            return arr[top];
        }

        public int isEmpty() {
            return top == -1 ? 1 : 0;
        }

        public int isFull() {
            return top == s ? 1 : 0;
        }
    }
}