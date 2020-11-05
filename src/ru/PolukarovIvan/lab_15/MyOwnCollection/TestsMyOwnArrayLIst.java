package ru.PolukarovIvan.lab_15.MyOwnCollection;

import java.util.Scanner;

public class TestsMyOwnArrayLIst {
    public static void main(String[] args) {

        Scanner In = new Scanner(System.in);
        int capacity = In.nextInt();
        MyOwnArrayList<Integer> myList = new MyOwnArrayList<>(capacity);

        int size = In.nextInt();
        for(int i = 0; i < size; i ++){
            myList.add((int)(Math.random() * 100));
        }

        for(int i = 0; i < size; i++){
            System.out.println(myList.get(i));
        }

    }
}
