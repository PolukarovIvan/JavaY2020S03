package ru.PolukarovIvan.lab_08.ex1;

import java.awt.*;
import javax.swing.*;

public class Window extends JFrame {
    Shape[] shapes = new Shape[20];
    public Window () {
        setTitle ("Ес... Минус три, ухуууууууу");
        setSize (new Dimension (1000, 1000));
        setVisible (true);
    }

    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < 20; i++) {
            int figure = (int) (Math.random() * 4);
            switch (figure) {
                case 0: {
                    shapes[i] = new Oval();
                    break;
                }
                case 1: {
                    shapes[i] = new Square();
                    break;
                }
                case 2: {
                    shapes[i] = new Rectangle();
                    break;
                }
                case 3: {
                    shapes[i] = new Circle();
                    break;
                }
            }
            System.out.println((i + 1) + ") " + shapes[i].toString());
            shapes[i].printF(g);
        }
    }

    public static void main (String [] args) {
        Window w = new Window();

    }

}