/****************************************************************
 * 
 * Following is the class structure of the Node class:
 * 
 * class Node {
 * public int data;
 * public Node next;
 * public Node prev;
 * 
 * Node()
 * {
 * this.data = 0;
 * this.next = null;
 * this.prev = null;
 * }
 * 
 * Node(int data)
 * {
 * this.data = data;
 * this.next = null;
 * this.prev = null;
 * }
 * 
 * Node(int data, Node next)
 * {
 * this.data = data;
 * this.next = next;
 * this.prev = next;
 * }
 * };
 * 
 *****************************************************************/

public class P28 {
    public static Node using_one_iteration(Node head, int k) {
        Node prev = null;
        Node curr = head;
        Node fwd = head;
        while (k-- != 0) {
            fwd = fwd.next;
        }
        while (fwd != null) {
            fwd = fwd.next;
            prev = curr;
            curr = curr.next;
        }
        if (prev == null) {
            head = head.next;
            return head;
        }
        prev.next = prev.next.next;

        return head;
    }

    public static Node removeKthNode(Node head, int K) {
        return using_one_iteration(head, K);
    }
}