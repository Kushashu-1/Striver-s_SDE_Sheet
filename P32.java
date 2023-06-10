public class P32 {
    public static boolean detectCycle(Node head) {
        Node f = head;
        Node s = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
            if (s == f)
                return true;
        }
        return false;
    }
}
