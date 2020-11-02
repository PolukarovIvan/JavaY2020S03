package ru.PolukarovIvan.lab_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{
    public static double G = 6.67e-11;

    public GUI(){
        JFrame window = new JFrame("Дизайн студия Артемия Лебедева");

        Label planetLabelChoose = new Label("Choose the planet: ");
        planetLabelChoose.setBounds(30, 30, 320, 20);
        planetLabelChoose.setFont(new Font("Times New Roman", Font.BOLD, 15));
        planetLabelChoose.setBackground(Color.gray);
        window.add(planetLabelChoose);

        JComboBox planetBoxChoose = new JComboBox();
        planetBoxChoose.addItem("Mercury");
        planetBoxChoose.addItem("Venus");
        planetBoxChoose.addItem("Earth");
        planetBoxChoose.addItem("Mars");
        planetBoxChoose.addItem("Jupiter");
        planetBoxChoose.addItem("Saturnz");
        planetBoxChoose.addItem("Uranus");
        planetBoxChoose.addItem("Neptune");

        planetBoxChoose.setBounds(30, 60, 320, 40);
        window.add(planetBoxChoose);

        Label answerLabel = new Label("");
        answerLabel.setBounds(150, 140, 205, 40);
        answerLabel.setFont(new Font("Arial", Font.BOLD, 15));
        answerLabel.setBackground(Color.lightGray);
        window.add(answerLabel);
        answerLabel.setVisible(true);

        Label gravityLevel = new Label("Planet's gravity: ");
        gravityLevel.setBounds(30, 140, 120, 40);
        gravityLevel.setFont(new Font("Arial", Font.BOLD, 15));
        gravityLevel.setBackground(Color.GRAY);
        window.add(gravityLevel);
        planetBoxChoose.setBackground(Color.lightGray);
        planetBoxChoose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (planetBoxChoose.getSelectedIndex() == 0) {
                    double res = G * Planets.Mercury.mass / (Planets.Mercury.radius * Planets.Mercury.radius);
                    String str = Double.toString(res);
                    answerLabel.setText(str + " кг/с^2");
                }
                else if (planetBoxChoose.getSelectedIndex() == 1) {
                    double res = G * Planets.Venus.mass / (Planets.Venus.radius * Planets.Venus.radius);
                    String str = Double.toString(res);
                    answerLabel.setText(str + " кг/с^2");
                }
                else if (planetBoxChoose.getSelectedIndex() == 2) {
                    double res = G * Planets.Earth.mass / (Planets.Earth.radius * Planets.Earth.radius);
                    String str = Double.toString(res);
                    answerLabel.setText(str + " кг/с^2");
                }
                else if (planetBoxChoose.getSelectedIndex() == 3) {
                    double res = G * Planets.Mars.mass / (Planets.Mars.radius * Planets.Mars.radius);
                    String str = Double.toString(res);
                    answerLabel.setText(str + " кг/с^2");
                }
                else if (planetBoxChoose.getSelectedIndex() == 4) {
                    double res = G * Planets.Jupiter.mass / (Planets.Jupiter.radius * Planets.Jupiter.radius);
                    String str = Double.toString(res);
                    answerLabel.setText(str + " кг/с^2");
                }
                else if (planetBoxChoose.getSelectedIndex() == 5) {
                    double res = G * Planets.Saturn.mass / (Planets.Saturn.radius * Planets.Saturn.radius);
                    String str = Double.toString(res);
                    answerLabel.setText(str + " кг/с^2");
                }
                else if (planetBoxChoose.getSelectedIndex() == 6) {
                    double res = G * Planets.Uranus.mass / (Planets.Uranus.radius * Planets.Uranus.radius);
                    String str = Double.toString(res);
                    answerLabel.setText(str + " кг/с^2");
                }
                else if (planetBoxChoose.getSelectedIndex() == 7) {
                    double res = G * Planets.Neptune.mass / (Planets.Neptune.radius * Planets.Neptune.radius);
                    String str = Double.toString(res);
                    answerLabel.setText(str + " кг/с^2");
                }
            }

        });

        window.setSize(400,300);
        window.setLayout(null);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.getContentPane().setBackground(Color.darkGray);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
