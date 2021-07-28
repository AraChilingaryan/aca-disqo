package com.aca.disqo.collections;

import java.util.ArrayList;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> myArrayList = new MyArrayList<>();
        MyList<Integer> myLinkedList = new MyLinkedList<>();

//        myArrayList.add(1);
//        myArrayList.add(null);
//        myArrayList.add(2);
//        myArrayList.add(-98);
//        myArrayList.add(124);
//        System.out.println(myArrayList);
//        System.out.println(myArrayList.size());
//        System.out.println(myArrayList.contains(null));
//        myArrayList.remove(null);
//        myArrayList.remove(Integer.valueOf(-98));
//        System.out.println(myArrayList);


        myLinkedList.add(1);
        myLinkedList.add(null);
        myLinkedList.add(2);
        myLinkedList.add(-98);
        myLinkedList.add(124);
        System.out.println(myLinkedList);

        myLinkedList.remove(Integer.valueOf(-98));
        myLinkedList.remove(null);
        System.out.println(myLinkedList);



    }
}
