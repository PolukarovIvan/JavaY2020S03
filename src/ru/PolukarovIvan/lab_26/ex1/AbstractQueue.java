package ru.PolukarovIvan.lab_26.ex1;

public interface AbstractQueue<E> {
    void enqueue(E element);
    String toString();
    E element();
    E dequeue();
    int size();
    boolean isEmpty();
    void clear();
}