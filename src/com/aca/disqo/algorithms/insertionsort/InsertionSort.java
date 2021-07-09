package com.aca.disqo.algorithms.insertionsort;

public class InsertionSort {

    private int arr[];
    private int nElems;

    public InsertionSort(int max) {
        arr = new int[max];
        nElems = 0;
    }

    public void insert(int n) {
        arr[nElems] = n;
        nElems++;
    }

    public int size() {
        return nElems;
    }

    public void display() {
        System.out.println("A :");
        for (int i = 0; i < nElems; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void sort() {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
