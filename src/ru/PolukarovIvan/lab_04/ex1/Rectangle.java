package ru.PolukarovIvan.lab_04.ex1;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {
        this.width = Double.NaN;
        this.length = Double.NaN;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }


    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public double getPerimeter(){
        return 2 * (length + width);
    }

    @Override
    public String toString(){
        return "Rectangle: {Length = " + length
                + ", Width = " + width
                + ", Color = " + getColor()
                + ", Filled = " + isFilled()
                + ", Area = " + getArea()
                + ", Perimeter = " + getPerimeter()
                + " }";


    }
}
