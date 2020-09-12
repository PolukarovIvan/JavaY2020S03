package ru.PolukarovIvan.lab_02.ex1;

public class Triangle extends Shape{

    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c, Color color ) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

}
