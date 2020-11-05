package ru.PolukarovIvan.lab_15;

import java.util.ArrayList;

public class TestArrayList {


    public static void main(String[] args) {
        int N = 6;
        ArrayList<Integer> list1 = new ArrayList(N);
        ArrayList<Character> list2 = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
            int tmp = (int) (Math.random() * 256);
            list1.add(tmp);
            list2.add((char) tmp);
        }

        for (int i = 0; i < N; i++) {
            System.out.println(list1.get(i) + " is " + list2.get(i));
        }

    }
}
