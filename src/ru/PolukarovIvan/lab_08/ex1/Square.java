package ru.PolukarovIvan.lab_08.ex1;

import java.awt.*;

public class Square extends Shape{

    private int width;

    public void setWidth() {
        this.width = setRandom(100);
    }

    public Square() throws HeadlessException {
        setWidth();
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                '}';
    }

    @Override
    public void printF(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(Color.black);
        g.setPaint(getColor());
        g.fillRect(getX(), getY(), width, width);

    }
}
