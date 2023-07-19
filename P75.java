class tn {
    tn[] c = new tn[26];
    boolean end = false;
}

public class P75 {
    static tn root;

    P75() {
        root = new tn();
    }

    public static void insert(String w) {
        tn node = root;
        for (int i = 0; i < w.length(); i++) {
            int p = w.charAt(i) - 'a';
            if (node.c[p] == null)
                node.c[p] = new tn();
            node = node.c[p];
        }
        node.end = true;
    }

    public static boolean search(String w) {
        tn node = root;
        for (int i = 0; i < w.length(); i++) {
            int p = w.charAt(i) - 'a';
            if (node.c[p] == null)
                return false;
            node = node.c[p];
        }
        return node.end;
    }

    public static boolean startsWith(String w) {
        tn node = root;
        for (int i = 0; i < w.length(); i++) {
            int p = w.charAt(i) - 'a';
            if (node.c[p] == null)
                return false;
            node = node.c[p];
        }
        return true;
    }
}