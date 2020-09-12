package ru.PolukarovIvan.lab_02.ex1;

public class Square extends Shape {

    private final double size;
    private final Point center;

    public Square(Point center, double size, Color color) {
        super(color);
        this.center = center;
        this.size = size;
    }

    public Point getCenter(){
        return this.center;
    }

    public double getSize(){return this.size;}

    @Override
    public double getArea(){return size*size;}

    @Override
    public String toString(){
        return "Square{" + "center = " + center + ", size = " + size + ", color = " + getColor() + "}";
    }
}
