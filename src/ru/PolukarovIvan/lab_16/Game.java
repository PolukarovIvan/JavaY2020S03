package ru.PolukarovIvan.lab_16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Game {
    private ArrayList<Integer> cards;
    private cardDeck deck1;
    private cardDeck deck2;
    private boolean cheating = false;

    public Game(ArrayList<Integer> cards) {
        this.cards = cards;
    }

    public Game() {
        cards = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            cards.add(i);
        }
    }

    public ArrayList<Integer> getCards() {
        return cards;
    }

    public void Shuffle(int n) {
        System.out.println("\nShuffling...");
        for (int i = 0; i < n; i++) {
            int a = (int) (Math.random() * 10);
            int b = (int) (Math.random() * 10);

            int tmp = cards.get(a);
            cards.set(a, cards.get(b));
            cards.set(b, tmp);
        }
        for (int card : cards) {
            System.out.print(card + " ");
        }
    }

    public void dealTheCards() {
        System.out.println("\nDealing the cards...");
        deck1 = new cardDeck();
        deck2 = new cardDeck();
        //System.out.println(cards.size());
        for (int i = 0; i < 5; i++) {
            deck1.add(cards.get(i * 2));
            deck2.add(cards.get(i * 2 + 1));
        }
        System.out.println("Desk 1: ");
        for (int card : deck1.getCards()) {
            System.out.print(card + " ");
        }
        System.out.println("\nDesk 2: ");
        for (int card : deck2.getCards()) {
            System.out.print(card + " ");
        }
    }

    public void setCheating(cardDeck d1, cardDeck d2) {
        this.cheating = true;
        this.deck1 = d1;
        this.deck2 = d2;
    }

    public String run() {
        if (!cheating) {
            Shuffle(100);
            dealTheCards();
        }

        int steps = 0;
        String winner = "botva";

        while (steps <= 160) {

            if (deck1.size() == 0) {
                return "The second player won!";
            }
            if (deck2.size() == 0) {
                return "The first player won!";
            }

            int card1 = deck1.pick();
            int card2 = deck2.pick();

            if (card1 > card2) {
                deck1.add2cards(card1, card2);
            } else {
                deck2.add2cards(card1, card2);
            }
            System.out.print("\nStep: " + steps + " Player 1: " + deck1.printDeck());
            System.out.print("\nStep:" + steps + "  Player 2: " + deck2.printDeck());

            steps += 1;

        }
        return winner;
    }
}
