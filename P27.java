import java.io.*;
import java.util.*;

/************************************************************
 * 
 * Following is the linked list node structure:
 * 
 * class LinkedListNode<T> {
 * T data;
 * LinkedListNode<T> next;
 * 
 * public LinkedListNode(T data) {
 * this.data = data;
 * }
 * }
 * 
 ************************************************************/

public class P27 {
    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        LinkedListNode res = null;
        LinkedListNode head = null;
        if (first == null)
            return second;
        if (second == null)
            return first;
        if (first.data > second.data) {
            res = second;
            second = second.next;
            head = res;
        } else {
            res = first;
            first = first.next;
            head = res;
        }
        while (first != null && second != null) {
            if (first.data > second.data) {
                res.next = second;
                second = second.next;
                res = res.next;
            } else {
                res.next = first;
                first = first.next;
                res = res.next;
            }

        }
        if (first != null)
            res.next = first;
        if (second != null)
            res.next = second;
        return head;
    }
}
