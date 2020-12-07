package ru.PolukarovIvan.lab_21.ex2;

public class MagicChair implements Chair {
    @Override
    public String toString() {
        return "MagicChair{}";
    }

    @Override
    public void sit() {
        System.out.println("Sitting on " + this.toString());
    }


}
