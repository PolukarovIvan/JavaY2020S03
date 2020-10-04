package ru.PolukarovIvan.lab_07.ex3;

public class Table extends Furniture{

    public Table(int coast, int volume, boolean sold) {
        super(coast, volume, sold);
    }

    @Override
    public String toString() {
        return "Table{" +
                "coast=" + coast +
                ", volume=" + volume +
                ", sold=" + sold +
                '}';
    }
}
