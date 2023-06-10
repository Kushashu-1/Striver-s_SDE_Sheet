/****************************************************************
 * 
 * Following is the class structure of the Node class:
 * 
 * class Node {
 * public int data;
 * public Node next;
 * 
 * Node()
 * {
 * this.data = 0;
 * this.next = null;
 * }
 * 
 * Node(int data)
 * {
 * this.data = data;
 * this.next = null;
 * }
 * 
 * Node(int data, Node next)
 * {
 * this.data = data;
 * this.next = next;
 * }
 * };
 * 
 *****************************************************************/

public class P37 {
    public static int len(Node head) {
        if (head == null)
            return 0;
        return 1 + len(head.next);
    }

    public static Node rotate(Node head, int k) {
        int l = len(head);
        k = k % l;
        Node i = head;
        Node j = head;
        while (k-- > 0) {
            j = j.next;
        }
        while (j.next != null) {
            i = i.next;
            j = j.next;
        }
        j.next = head;
        head = i.next;
        i.next = null;
        return head;
    }
}