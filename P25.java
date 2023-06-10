import java.io.*;
import java.util.*;

/*
	Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}

*/
public class P25 {
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) {
        if (head == null)
            return head;
        LinkedListNode prev = null;
        LinkedListNode curr = head;
        LinkedListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
