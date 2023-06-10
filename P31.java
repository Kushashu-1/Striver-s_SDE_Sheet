
/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

import java.util.*;

public class P31 {
    public static int brute_force(Node firstHead, Node secondHead) {
        Node first = firstHead;

        while (first != null) {
            Node second = secondHead;
            while (second != null) {
                if (first == second)
                    return first.data;
                second = second.next;
            }
            first = first.next;
        }
        return -1;
    }

    public static int optimised(Node firstHead, Node secondHead) {
        Node p = firstHead;
        Node q = secondHead;
        while (p != q) {
            if (p == null)
                p = secondHead;
            if (q == null)
                q = firstHead;
            p = p.next;
            q = q.next;
        }
        return p == null ? -1 : p.data;
    }

    public static int using_space(Node firstHead, Node secondHead) {
        HashSet<Node> hm = new HashSet<Node>();
        while (firstHead != null) {
            hm.add(firstHead);
            firstHead = firstHead.next;
        }
        while (secondHead != null) {
            if (hm.contains(secondHead))
                return secondHead.data;
            secondHead = secondHead.next;
        }
        return -1;
    }

    public static int findIntersection(Node firstHead, Node secondHead) {
        // return brute_force(firstHead,secondHead);
        // return using_space(firstHead,secondHead);
        return optimised(firstHead, secondHead);
    }
}