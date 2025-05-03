package src;

import java.util.Comparator;

public class HeapSort {
    public static void sort(Tweet[] array, Comparator<Tweet> comparator) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i, comparator);

        for (int i = n - 1; i > 0; i--) {
            Tweet temp = array[0]; array[0] = array[i]; array[i] = temp;
            heapify(array, i, 0, comparator);
        }
    }

    private static void heapify(Tweet[] array, int n, int i, Comparator<Tweet> comparator) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && comparator.compare(array[left], array[largest]) > 0)
            largest = left;

        if (right < n && comparator.compare(array[right], array[largest]) > 0)
            largest = right;

        if (largest != i) {
            Tweet swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapify(array, n, largest, comparator);
        }
    }
}
