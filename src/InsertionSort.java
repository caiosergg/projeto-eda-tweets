package src;

import java.util.Comparator;

public class InsertionSort {
    public static void sort(Tweet[] array, Comparator<Tweet> comparator) {
        for (int i = 1; i < array.length; i++) {
            Tweet key = array[i];
            int j = i - 1;

            while (j >= 0 && comparator.compare(array[j], key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
