import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class P48 {
    public static int maximumActivities(List<Integer> start, List<Integer> end) {
        List<int[]> activities = new ArrayList<int[]>(start.size());
        for (int i = 0; i < start.size(); i++) {
            activities.add(new int[] { start.get(i), end.get(i) });
        }
        activities.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] a1, int[] a2) {
                return a1[1] - a2[1];
            }
        });
        int count = 0;
        int endTime = 0;
        for (int[] activity : activities) {
            if (activity[0] >= endTime) {
                count++;
                endTime = activity[1];
            }
        }
        return count;
    }
}