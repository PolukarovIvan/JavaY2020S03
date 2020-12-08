package ru.PolukarovIvan.lab_26.ex1;

import java.sql.SQLOutput;

public class Test {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    private static void test1() {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        System.out.println(queue.toString());
        for (int i = 0; i < 20; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue.toString());
        System.out.println("Empty: "+ queue.isEmpty());
        for (int i = 0; i < 16; i++) {
            queue.dequeue();
        }
        System.out.println("Empty: "+ queue.isEmpty());
    }

    private static void test2() {
        ArrayQueueADT queue = new ArrayQueueADT();
        System.out.println(queue.toString());
        for (int i = 0; i < 20; i++) {
            ArrayQueueADT.enqueue(queue, i);
        }
        System.out.println(queue.toString());
        System.out.println("Empty: " + ArrayQueueADT.isEmpty(queue));
        for (int i = 0; i < 16; i++) {
            ArrayQueueADT.dequeue(queue);
        }
        System.out.println(ArrayQueueADT.isEmpty(queue));

    }

    private static void test3() {
        ArrayQueueModule queue = new ArrayQueueModule();
        System.out.println(queue.toString());
        for (int i = 0; i < 20; i++) {
            ArrayQueueModule.enqueue(i);
        }
        System.out.println(queue.toString());
        System.out.println(ArrayQueueModule.isEmpty());
        for (int i = 0; i < 16; i++) {
            ArrayQueueModule.dequeue();
        }
        System.out.println(ArrayQueueModule.isEmpty());

    }
}