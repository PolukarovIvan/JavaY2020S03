package ru.PolukarovIvan.lab_02.ex1;

public class Shape {

    private final Color color;

    public Shape(Color color){
        this.color =color;
    }

    public Color getColor(){
        return color;
    }

    public double getArea(){
        return Double.NaN;
    }
}
