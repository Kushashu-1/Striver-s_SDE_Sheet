import java.util.*;

public class P44 {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        Arrays.sort(at);
        Arrays.sort(dt);
        int i = 0;
        int j = 0;
        int res = 0;
        while (i < n && j < n) {
            if (at[i] <= dt[j]) {
                res++;
            } else
                j++;
            i++;
        }
        return res;
    }
}