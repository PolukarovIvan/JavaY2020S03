package ru.PolukarovIvan.lab_04.ex1;

public abstract class Shape {
    protected boolean filled;
    protected String color;

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public abstract String toString();

}
