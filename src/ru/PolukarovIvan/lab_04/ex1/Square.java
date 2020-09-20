package ru.PolukarovIvan.lab_04.ex1;

public class Square extends Rectangle {
    private double side;

    public Square() {
        this.side = Double.NaN;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.filled = filled;
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", filled=" + filled +
                ", color='" + color + '\'' +
                '}';
    }
}
