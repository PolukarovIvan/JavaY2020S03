package ru.PolukarovIvan.lab_03.ex1;

public class Circle {
    private double radius;
    private Point center;

    public Circle(double radius, Point center){
        this.center = center;
        this.radius = radius;
    }

    public void setCenter(Point center){
        this.center = center;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public Point getCenter(){
        return center;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public String toString(){
        return "Circle: {R = " + radius + ", " + center.toString();
    }

}
