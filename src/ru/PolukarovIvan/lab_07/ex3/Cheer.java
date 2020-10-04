package ru.PolukarovIvan.lab_07.ex3;

public class Cheer extends Furniture{
    public Cheer(int coast, int volume, boolean sold) {
        super(coast, volume, sold);
    }

    @Override
    public String toString() {
        return "Cheer{" +
                "coast=" + coast +
                ", volume=" + volume +
                ", sold=" + sold +
                '}';
    }
}
