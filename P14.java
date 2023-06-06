import java.io.*;
import java.util.*;

public class P14 {
    public static int modularExponentiation(int x, int n, int m) {
        long res = 1;
        long temp = x;
        for (int i = n; i > 0;) {
            // if power is Even we can devide in two sub problem else not
            if (i % 2 != 0)
                res = ((res % (long) m) * (temp % ((long) m))) % (long) (m);
            temp = (((temp) % ((long) m)) * ((temp) % ((long) m))) % (long) (m);
            i = i / 2;
        }
        return (int) (res % m);
    }
}