import java.util.ArrayList;

public class P13 {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        int m = mat.size();
        int n = mat.get(0).size();
        int i = 0;
        int j = n - 1;
        while (i < m && j >= 0) {
            if (mat.get(i).get(j) == target)
                return true;
            else if (mat.get(i).get(j) < target)
                i++;
            else if (mat.get(i).get(j) > target)
                j--;
        }
        return false;
    }
}
