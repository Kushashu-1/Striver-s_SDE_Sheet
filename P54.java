import java.util.*;

public class P54 {
    public static String kthPermutation(int n, int k) {
        List<Integer> num = new ArrayList<>();
        int fact = 1;
        for(int i = 1;i<n;i++)
        {
            fact*=i;
            num.add(i);
        }
        num.add(n);
        k = k-1;
        String res = "";
        while(true)
        {
            res+=num.get(k/fact);
            num.remove(k/fact);
            if(num.size()==0)
            return res;
            k = k%fact;
            fact = fact/num.size();
        }
    }
}}
