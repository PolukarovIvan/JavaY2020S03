package ru.PolukarovIvan.lab_07.ex1;

public class Plate extends Dish{
    private final int radius;
    public Plate(boolean clear, int radius) {
        super(clear);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "radius=" + radius +
                ", clear=" + clear +
                '}';
    }

    @Override
    public void wash() {
        this.clear = true;
    }

    @Override
    public void fill() {
        this.clear = false;
    }
}
