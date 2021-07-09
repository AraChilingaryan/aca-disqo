package com.aca.disqo.algorithms.quicksort;

import java.util.Random;

public class QuickSortApp {
    public static void main(String[] args) {
        int maxSize = 16;
        QuickSort quickSort;
        quickSort = new QuickSort(maxSize);
        for (int i = 0; i < maxSize; i++) {
            quickSort.insert(new Random().nextInt(100));
        }
        quickSort.display();
        quickSort.sort();
        quickSort.display();
    }
}
