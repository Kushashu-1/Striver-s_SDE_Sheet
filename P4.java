import java.util.*;
import java.io.*;

public class P4 {

    public static long maxSubarraySum(int[] arr, int n) {
        Long global_max = 0L;
        Long local_max = 0L;
        for (int i = 0; i < n; i++) {
            local_max = local_max + arr[i];
            if (global_max < local_max)
                global_max = local_max;
            if (local_max < 0)
                local_max = 0L;

        }
        return global_max;
    }

}
