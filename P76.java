import java.util.*;
import java.io.*;

class tn {
    tn[] c = new tn[26];
    int end = 0;
    int count = 0;
}

public class P76 {
    tn root;

    public P76() {
        root = new tn();
    }

    public void insert(String w) {
        tn node = root;
        for (int i = 0; i < w.length(); i++) {
            int p = w.charAt(i) - 'a';
            if (node.c[p] == null)
                node.c[p] = new tn();
            node.count++;
            node = node.c[p];
        }
        node.count++;
        node.end++;
    }

    public int countWordsEqualTo(String w) {
        tn node = root;
        for (int i = 0; i < w.length(); i++) {
            int p = w.charAt(i) - 'a';
            if (node.c[p] == null)
                return 0;
            node = node.c[p];
        }
        return node.end;
    }

    public int countWordsStartingWith(String w) {
        tn node = root;
        for (int i = 0; i < w.length(); i++) {
            int p = w.charAt(i) - 'a';
            if (node.c[p] == null)
                return 0;
            node = node.c[p];
        }
        return node.count;
    }

    public void erase(String w) {
        tn node = root;
        for (int i = 0; i < w.length(); i++) {
            int p = w.charAt(i) - 'a';
            if (node.c[p] == null)
                return;
            node.count--;
            node = node.c[p];
        }
        node.count--;
        node.end--;
    }

}
