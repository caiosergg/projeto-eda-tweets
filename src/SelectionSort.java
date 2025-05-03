package src;

import java.util.Comparator;

public class SelectionSort {
    public static void sort(Tweet[] array, Comparator<Tweet> comparator) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minOrMax = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(array[j], array[minOrMax]) < 0) {
                    minOrMax = j;
                }
            }
            Tweet temp = array[i];
            array[i] = array[minOrMax];
            array[minOrMax] = temp;
        }
    }
}
