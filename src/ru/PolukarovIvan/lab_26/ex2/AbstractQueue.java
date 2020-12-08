package ru.PolukarovIvan.lab_26.ex2;

public interface AbstractQueue<E> {

    void enqueue(E element);
    E dequeue();
    boolean isEmpty();

}