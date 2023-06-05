import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class P6 {
    public static int maximumProfit(ArrayList<Integer> prices) {
        int profit = 0;
        int n = prices.size();
        int min = prices.get(0);
        for (int i = 1; i < n; i++) {
            if (min > prices.get(i))
                min = prices.get(i);
            profit = Math.max(profit, prices.get(i) - min);
        }
        return profit;
    }
}