import java.io.*;
import java.util.* ;

public class P21{
    public static int using_space(int[] arr, int n)
    {
        HashSet<Integer> hm = new HashSet<>();
        for(int a:arr)
            hm.add(a);
        int global_max = 0;
        int local_max = 0;
        for(int a :hm)
        {
            if(!hm.contains(a-1))
            {
            local_max = 0;
            while(hm.contains(a))
            {
                local_max++;
                if(local_max>global_max)
                global_max = local_max;
                a = a+1;
            }
            }
        }
        return global_max;
        
    }
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        return using_space(arr , N);
    }
}
