package ru.PolukarovIvan.lab_26.ex2;


public class LinkedQueue<E> implements AbstractQueue<E> {

    private Node<E> head = null;
    private Node<E> tail = null;

    private static class Node<E> {

        Node<E> next;
        E value;

        public Node(E value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", value=" + value +
                    '}';
        }
    }



    @Override
    public void enqueue(E element) {
        if (head == null) {
            head = tail = new Node<>(element);
        } else {
            tail.next = new Node<>(element);
            tail = tail.next;
        }
    }

    @Override
    public E dequeue() {
        if (head == null) {
            return null;
        }
        E value = head.value;
        head = head.next;
        return value;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public String toString() {
        return "LinkedQueue{" +
                "head=" + head.toString() +
                ", tail=" + tail.toString() +
                '}';
    }
}