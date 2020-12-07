package ru.PolukarovIvan.lab_21.ex2;

public class MultifunctionalChair implements Chair {
    @Override
    public String toString() {
        return "MultifunctionalChair{}";
    }

    @Override
    public void sit() {
        System.out.println("Sitting on " + toString());
    }
}