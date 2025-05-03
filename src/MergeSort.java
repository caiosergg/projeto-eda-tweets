package src;

import java.util.Comparator;

public class MergeSort {
    public static void sort(Tweet[] array, Comparator<Tweet> comparator) {
        if (array.length <= 1) return;
        mergeSort(array, 0, array.length - 1, comparator);
    }

    private static void mergeSort(Tweet[] array, int left, int right, Comparator<Tweet> comparator) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid, comparator);
            mergeSort(array, mid + 1, right, comparator);
            merge(array, left, mid, right, comparator);
        }
    }

    private static void merge(Tweet[] array, int left, int mid, int right, Comparator<Tweet> comparator) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Tweet[] L = new Tweet[n1];
        Tweet[] R = new Tweet[n2];

        for (int i = 0; i < n1; i++) L[i] = array[left + i];
        for (int j = 0; j < n2; j++) R[j] = array[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (comparator.compare(L[i], R[j]) <= 0) {
                array[k++] = L[i++];
            } else {
                array[k++] = R[j++];
            }
        }

        while (i < n1) array[k++] = L[i++];
        while (j < n2) array[k++] = R[j++];
    }
}
