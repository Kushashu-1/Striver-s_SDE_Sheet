import java.util.*;
import java.io.*;

/*************************************************************
 * Following is the Binary Tree node structure
 * class TreeNode<T> {
 * public T data;
 * public TreeNode<T> left;
 * public TreeNode<T> right;
 * 
 * TreeNode(T data) {
 * this.data = data;
 * left = right = null;
 * }
 * 
 * };
 ************************************************************/
public class P130 {
    static TreeNode<Integer> solver(int[] pre, int[] i, int bound) {
        if (i[0] >= pre.length || bound < pre[i[0]])
            return null;
        TreeNode<Integer> root = new TreeNode(pre[i[0]++]);
        root.left = solver(pre, i, root.data);
        root.right = solver(pre, i, bound);
        return root;
    }

    public static TreeNode<Integer> preOrderTree(int[] preOrder) {
        return solver(preOrder, new int[] { 0 }, Integer.MAX_VALUE);
    }

}
