import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class P18 {
    public static int merge(int[] arr, int left, int mid, int right) {
        int count = 0;
        int j = mid + 1;
        for (int i = left; i <= mid; i++) {
            while (j <= right && arr[i] > (2 * (long) arr[j]))
                j++;
            count += (j - (mid + 1));

        }
        int[] arr1 = Arrays.copyOfRange(arr, left, mid + 1);
        int[] arr2 = Arrays.copyOfRange(arr, mid + 1, right + 1);
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }
        while (i < n1)
            arr[k++] = arr1[i++];
        while (j < n2)
            arr[k++] = arr2[j++];
        return count;
    }

    public static int mergeSort(int[] arr, int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = (left + right) >> 1;
            count += mergeSort(arr, left, mid);
            count += mergeSort(arr, mid + 1, right);
            count += merge(arr, left, mid, right);
        }
        return count;
    }

    public static int reversePairs(ArrayList<Integer> a) {
        // Extension of Merge Sort algorithm
        int[] arr = new int[a.size()];
        int j = 0;
        for (int i : a)
            arr[j++] = i;
        return mergeSort(arr, 0, arr.length - 1);
    }
}
