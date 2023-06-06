import java.util.*;
import java.io.*;

public class P12 {
    public static int merge(long[] arr, int left, int mid, int right) {
        int inversion_count = 0;
        long[] arr1 = Arrays.copyOfRange(arr, left, mid + 1);
        long[] arr2 = Arrays.copyOfRange(arr, mid + 1, right + 1);
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j])
                arr[k++] = arr1[i++];
            else {
                arr[k++] = arr2[j++];
                inversion_count += (mid + 1 - left - i);
            }
        }
        while (i < n1) {
            arr[k++] = arr1[i++];
        }
        while (j < n2) {
            arr[k++] = arr2[j++];
        }
        return inversion_count;
    }

    public static int mergeSort(long[] arr, int left, int right) {
        int inversion_count = 0;
        if (left < right) {
            int mid = (left + right) >> 1;
            inversion_count += mergeSort(arr, left, mid);
            inversion_count += mergeSort(arr, mid + 1, right);
            inversion_count += merge(arr, left, mid, right);
        }
        return inversion_count;
    }

    public static long getInversions(long arr[], int n) {
        return mergeSort(arr, 0, n - 1);
    }
}
