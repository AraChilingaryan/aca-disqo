package com.aca.disqo.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringUtil {

    public static void isOrderRight(String a, String b) {
        System.out.println(a.length() + b.length());
        String areStringInRightOrder = a.compareTo(b) > 0 ? "Yes" : "No";
        System.out.println(areStringInRightOrder);
        System.out.println((a).substring(0, 1).toUpperCase() + (a).substring(1)
                + " " + (b).substring(0, 1).toUpperCase() + (b).substring(1));
    }

    public static boolean isAnagrams(String a, String b) {
        if (a.length() == b.length()) {
            char[] charArrA = a.toCharArray();
            int[] intArrayA = asIntArray(charArrA);
            SortingUtil.insertionSort(intArrayA);

            char[] charArrB = b.toCharArray();
            int[] intArrayB = asIntArray(charArrB);
            SortingUtil.quickSort(intArrayB);
            return Arrays.equals(intArrayA, intArrayB);
        }
        else {
            return false;
        }
    }

    private static int[] asIntArray(char[] charArray) {
        int[] result = new int[charArray.length];
        Arrays.setAll(result, i -> (int) charArray[i]);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        //isOrderRight(A, B);
        isAnagrams(A, B);
        System.out.println(isAnagrams(A, B));


    }
}
