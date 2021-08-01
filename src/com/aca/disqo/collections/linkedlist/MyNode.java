package com.aca.disqo.collections.linkedlist;

public class MyNode<T>{
    T value;
    MyNode<T> next;
    MyNode<T> prev;

    public MyNode(MyNode<T> prev, T value, MyNode<T> next) {
        this.prev = prev;
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public MyNode<T> getNext() {
        return next;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }

    public MyNode<T> getPrev() {
        return prev;
    }

    public void setPrev(MyNode<T> prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(value);
        return stringBuilder.append("]").toString();
    }
}