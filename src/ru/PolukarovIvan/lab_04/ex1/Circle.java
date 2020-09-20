package ru.PolukarovIvan.lab_04.ex1;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        this.radius = Double.NaN;
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return "Circle: {Radius = " + radius
                + ", Color = " +getColor()
                + ", Filled = " + isFilled()
                + ", Area = " + getArea()
                + ", Perimeter = " + getPerimeter()
                + " }";
    }


}
