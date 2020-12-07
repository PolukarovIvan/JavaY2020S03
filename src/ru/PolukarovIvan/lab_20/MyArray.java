package ru.PolukarovIvan.lab_20;

public class MyArray <E> {

    private E[] data;

    public MyArray(E[] data) {
        this.data = data;
    }

    public final E find(int i) {
        return data[i];
    }

    public void set(int i, E el){
        data[i] = el;
    }
}
