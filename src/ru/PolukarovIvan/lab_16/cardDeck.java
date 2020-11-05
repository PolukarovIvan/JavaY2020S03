package ru.PolukarovIvan.lab_16;

import java.util.LinkedList;
import java.util.Queue;

public class cardDeck {
    private LinkedList<Integer> cards;

    public String printDeck() {
        String s = "";
        for(int card: cards){
            s += card;
        }
        return s;
    }

    public cardDeck() {
        this.cards = new LinkedList<>();
    }

    public void add(int card) {
        this.cards.addLast(card);
    }

    public void add2cards(int card1, int card2) {
        this.cards.addLast(card1);
        this.cards.addLast(card2);
    }

    public LinkedList<Integer> getCards() {
        return cards;
    }

    public int size(){
        return cards.size();
    }

    public int pick() {
        return cards.pollFirst();
    }
}
