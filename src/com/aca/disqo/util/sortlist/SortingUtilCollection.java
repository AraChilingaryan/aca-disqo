package com.aca.disqo.util.sortlist;

import java.util.List;

public class SortingUtilCollection<T> {

    public static <T extends Comparable<T>> void insertionSort(List<T> genericList) {
        int n = genericList.size();
        for (int i = 1; i < n; ++i) {
            T key = (T) genericList.get(i);
            int j = i - 1;

            while (j >= 0 && genericList.get(j).compareTo(key) > 0) {
                genericList.set(j + 1, genericList.get(j));
                j--;
            }
            genericList.set(j + 1, key);
        }
    }

    public static <T extends Comparable<T>> void quickSort(List<T> genericList) {
        recQuickSort(0, genericList.size() - 1, genericList);
    }

    private static <T extends Comparable<T>> void recQuickSort(int left, int right, List<T> genericList) {
        if (right - left <= 0) {
            return;
        } else {
            T pivot = genericList.get(right);
            int partition = partition(left, right, pivot, genericList);
            recQuickSort(left, partition - 1, genericList);
            recQuickSort(partition + 1, right, genericList);
        }
    }

    private static <T extends Comparable<T>> int partition(int left, int right, T pivot, List<T> genericList) {
        int leftPtr = left - 1;
        int rightPtr = right;
        while (true) {
            while (genericList.get(++leftPtr).compareTo(pivot) < 0) {
            }

            while (rightPtr > 0 && genericList.get(--rightPtr).compareTo(pivot) > 0) {
            }

            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr, genericList);
            }
        }
        swap(leftPtr, right, genericList);
        return leftPtr;
    }

    private static <T extends Comparable<T>> void swap(int dex1, int dex2, List<T> genericList) {
        T temp;
        temp = genericList.get(dex1);
        genericList.set(dex1, genericList.get(dex2));
        genericList.set(dex2, temp);
    }
}
