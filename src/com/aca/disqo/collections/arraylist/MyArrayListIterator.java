package com.aca.disqo.collections.arraylist;

import java.util.Iterator;

public class MyArrayListIterator<T> implements Iterator<T> {
    private MyArrayList<T> source = null;
    private int index = 0;

    public MyArrayListIterator(MyArrayList<T> source){
        this.source = source;
    }


    @Override
    public boolean hasNext() {
        return this.index < this.source.size();
    }

    @Override
    public T next() {
        return this.source.get(this.index++);
    }
}
