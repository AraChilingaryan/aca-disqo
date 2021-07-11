package com.aca.disqo.sort_algorithms;

import com.aca.disqo.sort_algorithms.insertionsort.InsertionSort;
import com.aca.disqo.sort_algorithms.quicksort.QuickSort;

public class SortingUtils {
    private static final QuickSort quickSort = new QuickSort();
    private static final InsertionSort insertionSort = new InsertionSort();

    public static void quickSort(int[] arr) {
        quickSort.sort(arr);
    }

    public static void insertionSort(int[] arr) {
        insertionSort.sort(arr);
    }
}
