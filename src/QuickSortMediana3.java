package src;

import java.util.Comparator;

public class QuickSortMediana3 {
    public static void sort(Tweet[] array, Comparator<Tweet> comparator) {
        quickSort(array, 0, array.length - 1, comparator);
    }

    private static void quickSort(Tweet[] array, int low, int high, Comparator<Tweet> comparator) {
        if (low < high) {
            int pivotIndex = medianaDeTres(array, low, high, comparator);
            Tweet temp = array[pivotIndex]; array[pivotIndex] = array[high]; array[high] = temp;

            int pi = partition(array, low, high, comparator);
            quickSort(array, low, pi - 1, comparator);
            quickSort(array, pi + 1, high, comparator);
        }
    }

    private static int medianaDeTres(Tweet[] array, int low, int high, Comparator<Tweet> comparator) {
        int mid = (low + high) / 2;
        Tweet a = array[low];
        Tweet b = array[mid];
        Tweet c = array[high];

        if (comparator.compare(a, b) > 0) { Tweet temp = a; a = b; b = temp; }
        if (comparator.compare(a, c) > 0) { Tweet temp = a; a = c; c = temp; }
        if (comparator.compare(b, c) > 0) { Tweet temp = b; b = c; c = temp; }

        if (b == array[low]) return low;
        else if (b == array[mid]) return mid;
        else return high;
    }

    private static int partition(Tweet[] array, int low, int high, Comparator<Tweet> comparator) {
        Tweet pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (comparator.compare(array[j], pivot) <= 0) {
                i++;
                Tweet temp = array[i]; array[i] = array[j]; array[j] = temp;
            }
        }
        Tweet temp = array[i + 1]; array[i + 1] = array[high]; array[high] = temp;
        return i + 1;
    }
}
