import java.util.*;
import java.io.*;

public class P110 {
    public static boolean areAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        int[] s = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            s[str1.charAt(i) - 'a']++;
            s[str2.charAt(i) - 'a']--;
        }
        for (int a : s)
            if (a != 0)
                return false;
        return true;
    }
}
