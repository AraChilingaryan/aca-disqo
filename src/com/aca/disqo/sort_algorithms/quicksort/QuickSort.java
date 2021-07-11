package com.aca.disqo.sort_algorithms.quicksort;

public class QuickSort  {

    public QuickSort() {
    }

    public void sort(int[] arr) {
        recQuickSort(0, arr.length - 1, arr);
    }

    private void recQuickSort(int left, int right, int[] arr) {
        if (right - left <= 0) {
            return;
        } else {
            int pivot = arr[right];
            int partition = partition(left, right, pivot, arr);
            recQuickSort(left, partition - 1, arr);
            recQuickSort(partition + 1, right, arr);
        }
    }

    private int partition(int left, int right, int pivot, int[] arr) {
        int leftPtr = left - 1;
        int rightPtr = right;
        while (true) {
            while (arr[++leftPtr] < pivot) {
                // check from left if finds element that greater than pivot stops
            }

            while (rightPtr > 0 && arr[--rightPtr] > pivot) {
                // check from right if finds element that less than pivot stops
            }

            // here we swap our elements which we have from while loops
            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr, arr);
            }
        }
        swap(leftPtr, right, arr);
        return leftPtr;
    }

    private void swap(int dex1, int dex2, int[] arr) {
        int temp;
        temp = arr[dex1];
        arr[dex1] = arr[dex2];
        arr[dex2] = temp;
    }
}
