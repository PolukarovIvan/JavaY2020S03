package ru.PolukarovIvan.lab_15;
import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();
        for(int i = 0 ; i < 10; i++){
            lst.add(i);
        }
        lst.add(4, 100101010);

        for(int element : lst){
            System.out.print(element + " ");
        }

    }
}
