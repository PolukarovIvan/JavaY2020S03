package ru.PolukarovIvan.lab_07.ex1;

public abstract class Dish {
    protected boolean clear;

    public boolean isClear() {
        return clear;
    }

    public void setClear(boolean clear) {
        this.clear = clear;
    }

    public Dish(boolean clear) {
        this.clear = clear;
    }

    @Override
    public abstract String toString();

    public abstract void wash();
    public abstract void fill();

}
