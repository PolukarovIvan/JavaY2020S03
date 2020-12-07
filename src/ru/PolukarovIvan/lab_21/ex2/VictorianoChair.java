package ru.PolukarovIvan.lab_21.ex2;


public class VictorianoChair implements Chair {
    @Override
    public String toString() {
        return "VictorianoChair{}";
    }

    @Override
    public void sit() {
        System.out.println("Sitting on " + toString());
    }
}