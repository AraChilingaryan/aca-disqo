package com.aca.disqo.collections.linkedlist;

import java.util.Iterator;

public class MyListIterator<T> implements Iterator<MyNode<T>> {
    private MyNode<T> current;

    public MyListIterator(final MyNode<T> first) {
        current = first;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public MyNode<T> next() {
        MyNode<T> tempo = current;
        current = current.getNext();
        return tempo;
    }
}