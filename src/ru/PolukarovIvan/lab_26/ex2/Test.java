package ru.PolukarovIvan.lab_26.ex2;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedQueue<Integer> q = new LinkedQueue<>();

        for(int i = 0; i < 10; i++){
            q.enqueue(i);
        }

        System.out.println(q.toString());

        while(!q.isEmpty()){
            System.out.println("Popping... " + q.dequeue());
        }
    }
}
