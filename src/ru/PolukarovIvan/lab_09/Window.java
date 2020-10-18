package ru.PolukarovIvan.lab_09;

import ru.PolukarovIvan.lab_08.ex1.*;
import ru.PolukarovIvan.lab_08.ex1.Rectangle;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    JButton but;

    public Window() {
        setTitle ("Random figure generator");
        setBackground(Color.white);

        but = new JButton("Generate figure!");
        but.setSize(50, 50);
        but.setLocation (100, 100);
        but.addMouseListener(new Mouse(this));

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(but);


        setDefaultCloseOperation (EXIT_ON_CLOSE);

        setVisible (true);

    }

    public void paint(Graphics g) {
        int k = (int) (Math.random() * 4);
        switch (k) {
            case 0: {
                Oval o = new Oval();
                o.printF(g);
                break;
            }
            case 1: {
                Square s = new Square();
                s.printF(g);
                break;
            }
            case 2: {
                Rectangle r = new Rectangle();
                r.printF(g);
                break;
            }
            case 3: {
                Circle c = new Circle();
                c.printF(g);
                break;
            }
        }
    }



}