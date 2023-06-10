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
 * Node(int data)
 * {
 * this.data = data;
 * this.next = null;
 * }
 * Node(int data, Node next)
 * {
 * this.data = data;
 * this.next = next;
 * }
 * }
 * 
 *****************************************************************/

public class P35 {
    public static Node firstNode(Node head) {
        Node s = head;
        Node f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
            if (s == f)
                break;

        }
        if (f == null || f.next == null)
            return null;
        Node temp = head;
        while (temp != s) {
            temp = temp.next;
            s = s.next;
        }
        return s;

    }
}
