package ru.PolukarovIvan.lab_08.ex1;
import java.awt.*;

public class Rectangle extends Shape {

    private int height;
    private int length;

    public void setHeight() {
        this.height = setRandom(100);
    }

    public void setLength() {
        this.length = setRandom(100);
    }

    public Rectangle() throws HeadlessException {
        setHeight();
        setLength();
    }

    @Override
    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void printF(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(getColor());
        g.setPaint(getColor());
        g.fillRect(getX(), getY(), height , length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", length=" + length +
                '}';
    }
}
