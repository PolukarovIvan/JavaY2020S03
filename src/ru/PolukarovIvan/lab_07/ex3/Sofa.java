package ru.PolukarovIvan.lab_07.ex3;

import java.lang.ref.SoftReference;

public class Sofa extends Furniture {
    public Sofa(int coast, int volume, boolean sold) {
        super(coast, volume, sold);
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "coast=" + coast +
                ", volume=" + volume +
                ", sold=" + sold +
                '}';
    }
}
