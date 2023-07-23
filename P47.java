import java.util.*;
import java.io.*;

public class P47 {
    public static int findMinimumCoins(int amount) {
        int[] coins = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
        int ans = 0;
        for (int i = 8; i >= 0; i--) {
            if (amount >= coins[i]) {
                ans = ans + amount / coins[i];
                amount = amount % coins[i];
            }
        }
        return ans;
    }
}
