import java.io.*;
import java.util.*;

/****************************************************************
 * 
 * Following is the class structure of the LinkedListNode class:
 * 
 * class LinkedListNode<T> {
 * T data;
 * LinkedListNode<T> next;
 * LinkedListNode(T data)
 * {
 * this.data = data;
 * this.next = null;
 * }
 * }
 * 
 *****************************************************************/

public class P30 {
    public static void By_shifting(LinkedListNode<Integer> node) {
        while (node.next.next != null) {
            node.data = node.next.data;
            node = node.next;
        }
        node.data = node.next.data;
        node.next = null;
    }

    public static void Constant_time_solution(LinkedListNode<Integer> node) {

        LinkedListNode prev = node;
        prev.data = node.next.data;
        prev.next = node.next.next;
    }

    public static void deleteNode(LinkedListNode<Integer> node) {
        // By_shifting(node);
        Constant_time_solution(node);
    }
}
