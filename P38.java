import java.io.*;
import java.util.*;

/*************************************************************
 * 
 * Following is the LinkedListNode class structure
 * 
 * class LinkedListNode<T> {
 * T data;
 * LinkedListNode<T> next;
 * LinkedListNode<T> random;
 * 
 * public LinkedListNode(T data) {
 * this.data = data;
 * }
 * }
 * 
 *************************************************************/

public class P38 {
    public static HashMap<LinkedListNode, LinkedListNode> hm = new HashMap();

    public static LinkedListNode copy(LinkedListNode node) {
        if (node == null)
            return node;
        if (!hm.containsKey(node)) {
            LinkedListNode newNode = new LinkedListNode(node.data);
            hm.put(node, newNode);
            return newNode;
        } else
            return hm.get(node);
    }

    public static LinkedListNode<Integer> cloneRandomList(LinkedListNode<Integer> head) {
        if (head == null)
            return head;
        LinkedListNode original_head = head;
        LinkedListNode newhead = new LinkedListNode(head.data);
        hm.put(original_head, newhead);
        while (head != null) {
            newhead.next = copy(head.next);
            newhead.random = copy(head.random);
            head = head.next;
            newhead = newhead.next;
        }
        return hm.get(original_head);
    }
}
