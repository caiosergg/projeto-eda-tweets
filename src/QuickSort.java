package src;

import java.util.Comparator;
import java.util.Random;

public class QuickSort {

    // Método principal para ordenar o array
    public static void sort(Tweet[] array, Comparator<Tweet> comparator) {
        quickSort(array, 0, array.length - 1, comparator);
    }

    // Método recursivo de QuickSort
    private static void quickSort(Tweet[] array, int low, int high, Comparator<Tweet> comparator) {
        if (low < high) {
            // Se o subarray for pequeno, usa o InsertionSort
            if (high - low < 10) {
                insertionSort(array, low, high, comparator);
            } else {
                // Caso contrário, usa o QuickSort
                int pi = partition(array, low, high, comparator);
                quickSort(array, low, pi - 1, comparator);
                quickSort(array, pi + 1, high, comparator);
            }
        }
    }

    // Método de partição para o QuickSort
    private static int partition(Tweet[] array, int low, int high, Comparator<Tweet> comparator) {
        // Escolhe um pivô aleatório
        Random rand = new Random();
        int pivotIndex = low + rand.nextInt(high - low + 1);
        Tweet pivot = array[pivotIndex];
        swap(array, pivotIndex, high);

        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (comparator.compare(array[j], pivot) <= 0) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    // Método auxiliar para trocar dois elementos no array
    private static void swap(Tweet[] array, int i, int j) {
        Tweet temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Método InsertionSort para subarrays pequenos
    private static void insertionSort(Tweet[] array, int low, int high, Comparator<Tweet> comparator) {
        for (int i = low + 1; i <= high; i++) {
            Tweet key = array[i];
            int j = i - 1;
            while (j >= low && comparator.compare(array[j], key) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
