package com.aca.disqo.collections;

import com.aca.disqo.collections.arraylist.MyArrayList;
import com.aca.disqo.collections.linkedlist.MyLinkedList;
import com.aca.disqo.collections.linkedlist.MyNode;

import java.util.Iterator;

public class TestMyList {

    public static void testMyArrayList(MyArrayList<Integer> myArrayList){
        System.out.println(myArrayList);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.contains(null));
        myArrayList.remove(null);
        myArrayList.remove(Integer.valueOf(-98));
        System.out.println(myArrayList);

        Iterator iterator = myArrayList.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(int i : myArrayList){
            System.out.println(i);
        }
    }

    public static void testMyMyLinkedList(MyLinkedList<Integer> myLinkedList ){
        System.out.println(myLinkedList);

        myLinkedList.remove(Integer.valueOf(-98));
        myLinkedList.remove(null);
        System.out.println(myLinkedList);

        Iterator iterator1 = myLinkedList.iterator();

        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        for(MyNode myNode : myLinkedList){
            System.out.println(myNode.getValue());
        }
    }
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.add(1);
        myArrayList.add(null);
        myArrayList.add(2);
        myArrayList.add(-98);
        myArrayList.add(124);
        testMyArrayList(myArrayList);

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(null);
        myLinkedList.add(2);
        myLinkedList.add(-98);
        myLinkedList.add(124);
        testMyMyLinkedList(myLinkedList);
    }
}
