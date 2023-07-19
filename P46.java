import java.util.*;
import java.io.*;

/****************************************************************
 * 
 * Following is the class structure of the Pair class:
 * 
 * class Pair
 * {
 * int weight;
 * int value;
 * Pair(int weight, int value)
 * {
 * this.weight = weight;
 * this.value = value;
 * }
 * 
 * }
 * 
 *****************************************************************/

public class P46 {
    public static double maximumValue(Pair[] item, int n, int w) {
        // Greedy
        Arrays.sort(item, (p, q) -> p.weight * q.value - q.weight * p.value);
        double res = 0.0;
        for (int i = 0; i < n; i++) {
            if (item[i].weight <= w) {
                res += item[i].value;
                w -= item[i].weight;
            } else {
                res += (((double) item[i].value * w / item[i].weight));
                break;
            }
        }
        return res;
    }
}
