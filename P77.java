import java.util.*;
import java.io.*;

class tn {
    tn[] c = new tn[26];
    boolean e = false;
}

class trie {
    tn r = new tn();

    void insert(String w) {
        tn n = r;
        for (int i = 0; i < w.length(); i++) {
            int p = w.charAt(i) - 'a';
            if (n.c[p] == null)
                n.c[p] = new tn();
            n = n.c[p];
        }
        n.e = true;
    }

    boolean complete(String w) {
        tn n = r;
        for (int i = 0; i < w.length(); i++) {
            int p = w.charAt(i) - 'a';
            n = n.c[p];
            if (!n.e)
                return false;
        }
        return n.e;
    }
}

class P77 {
    public static String completeString(int n, String[] a) {
        Arrays.sort(a, (p, q) -> q.length() - p.length() == 0 ? p.charAt(0) - q.charAt(0) : q.length() - p.length());
        trie t = new trie();
        for (String s : a)
            t.insert(s);
        for (String s : a)
            if (t.complete(s))
                return s;
        return "None";
    }
}