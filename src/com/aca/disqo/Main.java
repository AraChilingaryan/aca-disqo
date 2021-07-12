package com.aca.disqo;

import com.aca.disqo.util.SortingUtil;
import com.aca.disqo.util.StringUtil;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int[] createArray(int size) {
        int[] arr = new int[16];
        for (int i = 0; i < 16; i++) {
            arr[i] = (new Random().nextInt(100));
        }
        return arr;
    }

    public static String[] getString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Input first String : ");
        String firstString = scanner.next();
        scanner.nextLine();
        System.out.print("Please Input second String : ");
        String secondString = scanner.next();
        String[] strings = new String[2];
        strings[0] = firstString;
        strings[1] = secondString;
        return strings;
    }

    public static void printArray(int[] arr) {
        System.out.println("Array : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        String[] string = getString();
        String firstString = string[0];
        String secondString = string[1];
        System.out.println(StringUtil.isAnagrams(firstString, secondString) ? "Anagrams": "Not anagrams");
    }
}
