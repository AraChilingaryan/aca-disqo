package com.aca.disqo.collections;

public class MyLinkedList<T> implements MyList<T>{
    MyNode<T> first;
    MyNode<T> last;

    int size = 0;

    public MyLinkedList() {
    }


    @Override
    public T get(int index) {
        MyNode<T> currentNode;
        if (index < size / 2) {
            currentNode = first;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
        } else {
            currentNode = last;
            for (int i = size - 1; i > index; i--) {
                currentNode = currentNode.prev;
            }
        }
        return currentNode.value;
    }


    @Override
    public void add(T obj) {
        linkLast(obj);
    }

    public void linkFirst(T obj) {
        MyNode<T> f = first;
        MyNode<T> node = new MyNode<>(null, obj, f);
        first = node;
        if (f == null)
            last = node;
        else f.prev = node;
        size++;

    }

    public void linkLast(T obj) {
        MyNode<T> l = last;
        MyNode<T> node = new MyNode<>(l, obj, null);
        last = node;
        if (l == null)
            first = node;
        else l.next = node;
        size++;
    }

    public void unlinkLast() {
        last = last.prev;
        last.next = null;
        size--;
    }

    private void unlinkFirst() {
        first = first.next;
        first.prev = null;
        size--;
    }


    @Override
    public void remove(int index) {
        if (index == 0) {
            unlinkFirst();
            return;
        }
        if (index == size - 1) {
            unlinkLast();
            return;
        }

        if (index < size / 2) {
            MyNode<T> currentNode = first;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }

            currentNode.next = currentNode.next.next;
            currentNode.next.prev = currentNode;
            size--;
        } else {
            MyNode<T> currentNode = last;
            for (int i = size - 1; i > index; i--) {
                currentNode = currentNode.prev;
            }
        }


    }


    @Override
    public boolean remove(Object obj) {
        if(obj != null) {
            if (first.value.equals(obj)) {
                unlinkFirst();
                return true;
            }
            if (last.value.equals(obj)) {
                unlinkLast();
                return true;
            }
        }else {
            if (first.value == null) {
                unlinkFirst();
                return true;
            }
            if (last.value == null) {
                unlinkLast();
                return true;
            }
        }
        MyNode<T> current = first;
        for (int i = 0; i < size; i++) {

            if (obj != null) {
                if (current.next.value == obj) {
                    current.next = current.next.next;
                    current.next.prev = current;
                    size--;
                    return true;
                }
            } else {
                if (current.next.value == null) {
                    current.next = current.next.next;
                    current.next.prev = current;
                    size--;
                    return true;
                }

            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object obj) {
        MyNode<T> currentNode = first;
        for (int i = 0; i < size; i++) {
            if (currentNode.value.equals(obj)) return true;
            currentNode = currentNode.next;
        }
        return false;
    }

    @Override
    public String toString() {
        MyNode<T> current = first;
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(current.value);
            if (i < size - 1) {
                stringBuilder.append(",");
            }
            current = current.next;

        }

        return stringBuilder.append("]").toString();
    }

    private class MyNode<T>{
        T value;
        MyNode<T> next;
        MyNode<T> prev;

        public MyNode(MyNode<T> prev, T value, MyNode<T> next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }


}
