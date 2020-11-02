package ru.PolukarovIvan.lab_11.ex2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Regions {

    public Regions() {
        JFrame frame = new JFrame("Regions travelling");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int height = 100, width = 300, x = 500, y = 500;
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        JTextField textField = new JTextField();
        textField.setColumns(30);
        panel.add(textField);
        ActionListener northAct = e -> {
            JDialog dialog = new JDialog(frame, "Добро пожаловать в САО");
            dialog.setBounds(500, 500, 200, 100);
            dialog.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
            dialog.setVisible(true);
        };
        ActionListener southAct = e -> {
            JDialog dialog = new JDialog(frame, "Добро пожаловать в ЮАО");
            dialog.setBounds(x, y, width, height);
            dialog.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
            dialog.setVisible(true);
        };
        ActionListener eastAct = e -> {
            JDialog dialog = new JDialog(frame, "Добро пожаловать в ВАО");
            dialog.setBounds(x, y, width, height);
            dialog.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
            dialog.setVisible(true);
        };
        ActionListener westAct = e -> {
            JDialog dialog = new JDialog(frame, "Добро пожаловать в ЗАО");
            dialog.setBounds(x, y, width, height);
            dialog.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
            dialog.setVisible(true);
        };
        ActionListener centerAct = e -> {
            JDialog dialog = new JDialog(frame, "Добро пожаловать в ЦАО");
            dialog.setBounds(x, y, width, height);
            dialog.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
            dialog.setVisible(true);
        };
        JButton northButton = new JButton("САО");
        panel.add(northButton, BorderLayout.NORTH);
        northButton.addActionListener(northAct);

        JButton southButton = new JButton("ЮАО");
        panel.add(southButton, BorderLayout.SOUTH);
        southButton.addActionListener(southAct);

        JButton eastButton = new JButton("ВАО");
        panel.add(eastButton, BorderLayout.EAST);
        eastButton.addActionListener(eastAct);

        JButton westButton = new JButton("ЗАО");
        panel.add(westButton, BorderLayout.WEST);
        westButton.addActionListener(westAct);

        JButton centerButton = new JButton("ЦАО");
        panel.add(centerButton, BorderLayout.CENTER);
        centerButton.addActionListener(centerAct);

        frame.getContentPane().add(panel);
        frame.setPreferredSize(new Dimension(1200, 720));


        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Regions();
    }
}