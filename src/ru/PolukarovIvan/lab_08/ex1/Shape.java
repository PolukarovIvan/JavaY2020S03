package ru.PolukarovIvan.lab_08.ex1;

import javax.swing.*;
import java.awt.*;

public abstract class Shape extends JFrame {

    private static Color black = new Color(0,0,0);
    private Color color;
    private int x;
    private int y;

    public Shape() throws HeadlessException {
        setColor();
        setX();
        setY();
    }

    public Color getColor() {
        return color;
    }

    public void setColor() {
        this.color = new Color(
                (int)(Math.random()*255),
                (int)(Math.random()*255),
                (int)(Math.random()*255)
        );
    }

    @Override
    public int getX() {
        return x;
    }

    public void setX() {
        this.x = (int)(Math.random() * 600);
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY() {
        this.y = (int)(Math.random() * 600);
    }

    public int setRandom(int number){
        return (int)(Math.random()*number);
    }

    public abstract void printF(Graphics gr);

}
