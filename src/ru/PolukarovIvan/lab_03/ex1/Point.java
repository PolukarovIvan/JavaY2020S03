package ru.PolukarovIvan.lab_03.ex1;

public class Point {

    private final double X;
    private final double Y;

    public Point(double X, double Y){
        this.X = X;
        this.Y = Y;
    }

    public double getX(){return X;}
    public double getY(){return Y;}

    public String toString(){
        return "Point: (X = " + X + ", Y = " + Y + ")";
    }
}
