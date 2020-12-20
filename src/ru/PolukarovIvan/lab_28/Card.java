package ru.PolukarovIvan.lab_28;

import java.util.Objects;

public class Card {
    private int amount;
    private String number;
    private String date;
    private String cvv;

    Card(String number, String date, String cvv) {
        this.amount = 1000;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card that = (Card) o;
        return  Objects.equals(number, that.number) &&
                Objects.equals(date, that.date) &&
                Objects.equals(cvv, that.cvv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, date, cvv);
    }

    public int getAmount() {
        return amount;
    }
}