import java.util.*;
import java.io.*;

/*
    Definition of Node class for reference

    class TreeNode<T> 
    {
        public T data;
        public TreeNode<T> left;
        public TreeNode<T> right;

        TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    }

*/
public class P148 {

    static class BSTIterator {
        Stack<TreeNode<Integer>> stk = new Stack<>();

        BSTIterator(TreeNode<Integer> root) {
            pushAll(root);
        }

        int next() {
            TreeNode<Integer> top = stk.pop();
            pushAll(top.right);
            return top.data;
        }

        boolean hasNext() {
            return !stk.isEmpty();
        }

        void pushAll(TreeNode<Integer> node) {
            while (node != null) {
                stk.push(node);
                node = node.left;
            }
        }
    }
}

/*
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator iterator = new BSTIterator(root);
 * while(iterator.hasNext())
 * {
 * print(iterator.next()+" ");
 * }
 */
