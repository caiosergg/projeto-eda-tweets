package src;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        String[] atributos = {"user", "date", "mentionedPersonCount"};
        String[] casos = {"melhorCaso", "medioCaso", "piorCaso"};
        String[] algoritmos = {
            "insertionSort", "selectionSort", "mergeSort", "quickSort",
            "quickSortMediana3", "heapSort", "countingSort"
        };

        for (String atributo : atributos) {
            for (String algoritmo : algoritmos) {
                // CountingSort só serve para o atributo "mentionedPersonCount"
                if (algoritmo.equals("countingSort") && !atributo.equals("mentionedPersonCount")) {
                    continue;
                }

                for (String caso : casos) {
                    String inputPath = "data/tweets_mentioned_persons.csv";
                    Tweet[] tweets = TweetLoader.load(inputPath);

                    // Ordenar o array conforme o caso
                    Tweet[] tweetsOrdenados = gerarCaso(tweets, atributo, caso, algoritmo);

                    long start = System.nanoTime();
                    Tweet[] ordenado = ordenar(tweetsOrdenados, atributo, algoritmo);
                    long end = System.nanoTime();

                    System.out.println("Ordenado: " + atributo + " - " + algoritmo + " - " + caso +
                            " em " + ((end - start) / 1_000_000.0) + " ms");

                    String outputPath = "outputs/tweets_mentioned_persons_" + atributo + "_" + algoritmo + "_" + caso + ".csv";
                    TweetWriter.write(outputPath, ordenado);
                }
            }
        }
    }

    public static Tweet[] gerarCaso(Tweet[] original, String atributo, String caso, String algoritmo) {
        Tweet[] copia = Arrays.copyOf(original, original.length);

        switch (caso) {
            case "melhorCaso":
                // Ordena previamente para simular o melhor caso
                return ordenar(copia, atributo, "mergeSort"); // pode usar qualquer algoritmo estável
            case "piorCaso":
                // Ordena e inverte para simular o pior caso
                Tweet[] ordenado = ordenar(copia, atributo, "mergeSort");
                return inverterArray(ordenado);
            case "medioCaso":
            default:
                // Deixa os dados como estão
                return copia;
        }
    }

    public static Tweet[] inverterArray(Tweet[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            Tweet temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static Tweet[] ordenar(Tweet[] array, String atributo, String algoritmo) {
    Comparator<Tweet> comparator = TweetComparator.getComparator(atributo); // Obter o comparator dinâmico

    switch (algoritmo) {
        case "insertionSort":
            InsertionSort.sort(array, comparator); break;
        case "selectionSort":
            SelectionSort.sort(array, comparator); break;
        case "mergeSort":
            MergeSort.sort(array, comparator); break;
        case "quickSort":
            QuickSort.sort(array, comparator); break;
        case "quickSortMediana3":
            QuickSortMediana3.sort(array, comparator); break;
        case "heapSort":
            HeapSort.sort(array, comparator); break;
        case "countingSort":
            CountingSort.sortByMentionCount(array); break; // Usando o método sortByMentionCount
    }
    return array;
}

}
