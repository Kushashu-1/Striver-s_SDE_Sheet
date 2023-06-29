import java.util.*;
import java.io.*;
/*   
    Following is the Binary Tree node structure for referance:

    class TreeNode
    {
        int data;
        TreeNode left, right;
    
        public TreeNode(int item)
        {
            data = item;
            left = right = null;
        }
    }
*/

public class P119 {
    static boolean rec_sol(ArrayList<Integer> res, TreeNode root, int x) {
        if (root == null)
            return false;
        if (root.data == x) {
            res.add(root.data);
            return true;
        }
        res.add(root.data);

        if (rec_sol(res, root.left, x)) {
            return true;
        }
        if (rec_sol(res, root.right, x)) {
            return true;
        }
        res.remove(res.size() - 1);
        return false;

    }

    public static ArrayList<Integer> pathInATree(TreeNode root, int x) {
        ArrayList<Integer> res = new ArrayList<>();
        rec_sol(res, root, x);
        // System.out.println(res);
        return res;
    }
}