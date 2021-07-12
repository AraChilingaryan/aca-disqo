package com.aca.disqo.util;

public class SortingUtil {

    public static void insertionSort(int[] arr) {
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

    public static void quickSort(int[] arr) {
        recQuickSort(0, arr.length - 1, arr);
    }

    private static void recQuickSort(int left, int right, int[] arr) {
        if (right - left <= 0) {
            return;
        } else {
            int pivot = arr[right];
            int partition = partition(left, right, pivot, arr);
            recQuickSort(left, partition - 1, arr);
            recQuickSort(partition + 1, right, arr);
        }
    }

    private static int partition(int left, int right, int pivot, int[] arr) {
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
                swap(leftPtr, rightPtr, arr);
            }
        }
        swap(leftPtr, right, arr);
        return leftPtr;
    }

    private static void swap(int dex1, int dex2, int[] arr) {
        int temp;
        temp = arr[dex1];
        arr[dex1] = arr[dex2];
        arr[dex2] = temp;
    }
}
