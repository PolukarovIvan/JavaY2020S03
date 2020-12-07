package ru.PolukarovIvan.lab_20;

public class MyArray <T> {

    private T[] data;

    public MyArray(T[] data) {
        this.data = data;
    }

    public final T get(int i) {
        return data[i];
    }

    public void set(int i, T el){
        data[i] = el;
    }

    public int size(){
        return data.length;
    }

    public void print(){
        for(T el : data){
            System.out.println(el);        }
    }

}
