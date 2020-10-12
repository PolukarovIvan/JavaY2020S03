package ru.PolukarovIvan.lab_08.ex2;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class ImageTest extends JFrame {
    Image image;
    String a;

    ImageTest(String a){
        this.a = a;
        try {
            image = ImageIO.read(new File(a));
        } catch (IOException e) {
            e.printStackTrace();
        }
        setBounds(0,0,image.getHeight(null),image.getWidth(null));
        setTitle ("Why..." );
        Container container = getContentPane();
        container.setLayout(new GridLayout());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        if(image!=null) {
            g.drawImage(image, 0, 0, null);
        }
    }
    public static void main(String[] args) {
        new ImageTest(args[0]); //C:\Право\Скан_20200516.jpg
        System.out.println(args[0]);
    }

}