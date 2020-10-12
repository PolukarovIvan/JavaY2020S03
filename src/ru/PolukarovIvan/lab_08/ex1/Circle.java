package ru.PolukarovIvan.lab_08.ex1;

import java.awt.*;

public class Circle extends Shape {

    public void setRadius() {
        this.radius = setRandom(100);
    }

    private int radius;

    public Circle() throws HeadlessException {
        setRadius();
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void printF(Graphics gr){
        Graphics2D g = (Graphics2D)gr;
        g.setColor(Color.black);
        g.setPaint(getColor());
        g.fillOval(getX(), getY(), radius, radius);

    }

}
