package ru.PolukarovIvan.lab_08.ex1;

import java.awt.*;

public class Oval extends Shape {
    private int width, height;

    public Oval() throws HeadlessException {
        setHeight();
        setWidth();
    }

    @Override
    public String toString() {
        return "Oval{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public void printF(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(Color.black);
        g.setPaint(getColor());
        g.fillOval(getX(), getY(), getHeight() , getWidth());
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public void setWidth() {
        this.width = setRandom(100);
    }

    public void setHeight() {
        this.height = setRandom(100);
    }
}