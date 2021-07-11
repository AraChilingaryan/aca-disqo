package com.aca.disqo.stringusage;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.IntStream;

public class LexicographicallyOrder {
    public static void isOrderRight(String a, String b) {
        System.out.println(a.length() + b.length());
        String areStringInRightOrder = a.compareTo(b) > 0 ? "Yes" : "No";
        System.out.println(areStringInRightOrder);
        System.out.println((a).substring(0, 1).toUpperCase() + (a).substring(1)
                + " " + (b).substring(0, 1).toUpperCase() + (b).substring(1));
    }

    public static boolean isAnagrams(String a, String b) {
        Map<Character, Integer> map = new HashMap<>();
        String sum = a.toLowerCase() + b.toLowerCase();
        if (a.length() == b.length()) {
            for (char c : sum.toCharArray()) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        } else {
            return false;
        }
        map.forEach((key, value) -> System.out.println(key + ":" + value));
        return map.keySet().stream().noneMatch(character -> map.get(character) % 2 == 1);
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
