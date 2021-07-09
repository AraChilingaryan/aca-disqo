package com.aca.disqo.algorithms.insertionsort;

import java.util.Random;

public class InsertionSortApp {
    public static void main(String[] args) {
        int maxSize = 16;
        InsertionSort insertionSort;
        insertionSort = new InsertionSort(maxSize);
        for (int i = 0; i < maxSize; i++) {
            insertionSort.insert(new Random().nextInt(100));
        }
        insertionSort.display();
        insertionSort.sort();
        insertionSort.display();
    }
}
