package ru.PolukarovIvan.lab_15.MyOwnCollection;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.*;

public class MyOwnArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, Serializable {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private E[] data;

    public MyOwnArrayList(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException();
        data = (E[]) new Object[capacity];
    }

    public void ensureCapacity(int minCapacity) {
        int current = data.length;
        if (minCapacity > current) {
            E[] newData = (E[]) new Object[Math.max(current * 2, minCapacity)];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object e) {
        return indexOf(e) != -1;
    }

    public int indexOf(Object e) {
        for (int i = 0; i < size; i++)
            if (e== data[i])
                return i;
        return -1;
    }

    public int lastIndexOf(Object e) {
        for (int i = size - 1; i >= 0; i--)
            if (e == data[i])
                return i;
        return -1;
    }

    public E get(int index) {
        checkBoundExclusive(index);
        return data[index];
    }

    public E set(int index, E e) {
        checkBoundExclusive(index);
        E result = data[index];
        data[index] = e;
        return result;
    }

    public boolean add(E e) {
        modCount++;
        if (size == data.length){
            throw new IndexOutOfBoundsException("Index: " + size + ", Size: " + size);
        }
        data[size++] = e;
        return true;
    }

    public E remove(int index) {
        checkBoundExclusive(index);
        E r = data[index];
        modCount++;
        if (index != --size)
            System.arraycopy(data, index + 1, data, index, size - index);
        data[size] = null;
        return r;
    }

    public void clear() {
        if (size > 0) {
            modCount++;
            Arrays.fill(data, 0, size, null);
            size = 0;
        }
    }

    private void checkBoundExclusive(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }

}