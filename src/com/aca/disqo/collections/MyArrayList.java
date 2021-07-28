package com.aca.disqo.collections;

public class MyArrayList<T> implements MyList<T> {
    private Object[] data;
    private static final int FACTOR = 5;
    private int capacity;
    private int cursor;

    public MyArrayList() {
        capacity = FACTOR;
        data = new Object[capacity];
    }

    @Override
    @SuppressWarnings("unchecked")
    public T get(int index) {
        checkIndex(index);
        return (T) data[index];
    }

    @Override
    public void add(T obj) {
        if (cursor == capacity - 1) {
            growArray();
        }
        data[cursor++] = obj;

    }

    private void growArray() {
        capacity += FACTOR;
        Object[] newData = new Object[capacity];
        System.arraycopy(data, 0, newData, 0, cursor);
        data = newData;

    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < cursor - 1; i++) {
            data[i] = data[i + 1];
        }
        cursor--;
    }

    @Override
    public boolean remove(T obj) {
        int index = indexOf(obj);
        if (index != -1) {
            remove(index);
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return cursor;
    }

    @Override
    public boolean contains(T obj) {
        return indexOf(obj) != -1;
    }


    private int indexOf(T obj) {
        for (int i = 0; i < cursor; i++) {
            if (data[i] != null) {
                if (data[i].equals(obj)) {
                    return i;
                }
            } else {
                return i;
            }
        }
        return -1;
    }

    private void checkIndex(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index must be > 0");
        }
        if (index >= cursor) {
            throw new IndexOutOfBoundsException("Index must be < " + cursor);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < cursor; i++) {
            result.append(data[i]);
            if (i < cursor - 1) {
                result.append(",");
            }
        }
        result.append("]");
        return result.toString();
    }

}
