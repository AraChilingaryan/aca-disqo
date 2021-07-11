package com.aca.disqo;

import com.aca.disqo.sort_algorithms.SortingUtils;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        int[] arr = new int[16];
//        for (int i = 0; i < 16; i++) {
//            arr[i] = (new Random().nextInt(100));
//        }
//        System.out.println("Array before sort : ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        SortingUtils.quickSort(arr);
//        //SortingUtils.insertionSort(arr);
//
//        System.out.println("A : ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
        String A = "hello";
        String B = "java";
        System.out.println(A.length() + B.length());
        String answer = A.compareTo(B) >= 0 ? "yes":"no";
        System.out.println((A + B).substring(0,1).toUpperCase() + (A + B).substring(1));

    }
}
