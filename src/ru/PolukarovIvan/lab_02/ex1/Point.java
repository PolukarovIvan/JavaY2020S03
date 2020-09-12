package ru.PolukarovIvan.lab_02.ex1;

public class Point {
    private final double X;
    private final double Y;

    public Point(double X, double Y){
        this.X = X;
        this.Y = Y;
    }
    public double getX(){return X;}
    public double getY(){return Y;}

    @Override
    public String toString(){return "(X = " + X + "; Y = " + Y + ")"; }
}
