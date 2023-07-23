import java.util.*;
import java.io.*;

public class P109 {
    public static String writeAsYouSpeak(int n) {
        if (n == 1)
            return "1";
        if (n == 2)
            return "11";
        String s = "11";
        String t = "";
        for (int i = 3; i <= n; i++) {
            s = s + '$';
            t = "";
            int c = 1;
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j - 1) == s.charAt(j))
                    c++;
                else {
                    t = t + c + s.charAt(j - 1);
                    c = 1;
                }
            }
            s = t;
        }
        return s;
    }
}