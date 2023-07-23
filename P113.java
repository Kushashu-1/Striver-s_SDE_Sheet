import java.util.*;
import java.io.*;
/*
    
    Following is the Binary Tree node structure:

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.data = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
           this.data = val;
            this.left = left;
            this.right = right;
        }
    }

*/

public class P113 {
    static List<Integer> res;

    static void post(TreeNode root) {
        if (root == null)
            return;
        post(root.left);
        post(root.right);
        res.add(root.data);
    }

    public static List<Integer> getPostOrderTraversal(TreeNode root) {
        res = new ArrayList<Integer>();
        post(root);
        return res;
    }
}
