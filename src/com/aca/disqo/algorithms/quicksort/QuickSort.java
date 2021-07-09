package com.aca.disqo.algorithms.quicksort;

public class QuickSort {

    private int arr[];
    private int nElems;

    public QuickSort(int max) {
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
        recQuickSort(0, nElems - 1);
    }

    private void recQuickSort(int left, int right) {
        if (right - left <= 0) {
            return;
        } else {
            int pivot = arr[right];
            int partition = partition(left, right, pivot);
            recQuickSort(left, partition - 1);
            recQuickSort(partition + 1, right);
        }
    }

    private int partition(int left, int right, int pivot) {
        int leftPtr = left - 1;
        int rightPtr = right;
        while (true) {

            while (arr[++leftPtr] < pivot) {

            }

            while (rightPtr > 0 && arr[--rightPtr] > pivot) {

            }

            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);
            }
        }
        swap(leftPtr, right);
        return leftPtr;
    }

    private void swap(int dex1, int dex2) {
        int temp;
        temp = arr[dex1];
        arr[dex1] = arr[dex2];
        arr[dex2] = temp;
    }
}
