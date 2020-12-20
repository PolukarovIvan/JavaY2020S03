package ru.PolukarovIvan.lab_28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pay implements IPay {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private Card card;
    private int balance = 1000;

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("Card number: ");
            String number = READER.readLine();
            System.out.print("Date 'mm/yy': ");
            String date = READER.readLine();
            System.out.print("CVV: ");
            String cvv = READER.readLine();
            card = new Card(number, date, cvv);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public void pay(int paymentAmount) throws Exception {
        if (cardIsPresent()) {
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            card.setAmount(card.getAmount() - paymentAmount);

        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}