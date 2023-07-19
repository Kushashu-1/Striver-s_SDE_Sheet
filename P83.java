import java.util.*;
import java.io.*;

// Using linkedList
class Node {
    int val;
    Node next = null;

    Node(int val) {
        this.val = val;
    }
}

public class Queue {
    Node head;
    Node tail;
    int s = 0;

    Queue() {

    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        return s == 0;
    }

    void enqueue(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            tail = tail.next;
        }
        s++;
    }

    int dequeue() {
        if (s == 0)
            return -1;
        else {
            int v = head.val;
            head = head.next;
            s--;
            return v;
        }

    }

    int front() {
        if (s == 0)
            return -1;
        return head.val;
    }

}
