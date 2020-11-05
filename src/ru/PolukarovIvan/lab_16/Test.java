package ru.PolukarovIvan.lab_16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        Game game1 = new Game();
        ArrayList <Integer> game1_cards = game1.getCards();
        for (int card : game1_cards) {
            System.out.print(card + " ");
        }
        String result = game1.run();
        System.out.println("\n" + result);
    }
}