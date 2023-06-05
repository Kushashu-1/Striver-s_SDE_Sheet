import java.io.*;
import java.util.*;

public class P9 {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {

        int i = 0;
        for (int j = 0; j < n; j++) {
            for (i = m + j - 1; i >= 0; i--) {
                if (arr1[i] >= arr2[j]) {
                    arr1[i + 1] = arr1[i];
                } else {
                    arr1[i + 1] = arr2[j];
                    break;
                }
            }
            if (i == -1)
                arr1[0] = arr2[0];
        }
        return arr1;
    }
}
