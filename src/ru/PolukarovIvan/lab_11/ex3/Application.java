package ru.PolukarovIvan.lab_11.ex3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.text.JTextComponent;

public class Application extends JFrame {

    private JTextArea textArea;

    public Application() {
        super("ex3");
        createGUI();
        JFrame.setDefaultLookAndFeelDecorated(true);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void createGUI() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel frame = new JPanel();
        frame.setLayout(new FlowLayout());

        JTextField textField1 = new JTextField("Font: ", 10);
        frame.add(textField1);

        JTextField textField2 = new JTextField("Color: ", 10);
        frame.add(textField2);

        JComboBox fontChoosing = new JComboBox();
        fontChoosing.setEditable(true);
        fontChoosing.addItem("Times New Roman");
        fontChoosing.addItem("MS Sans Serif");
        fontChoosing.addItem("Courier New");
        frame.add(fontChoosing);

        JComboBox colorChoosing = new JComboBox();
        colorChoosing.setEditable(true);
        colorChoosing.addItem("Black");
        colorChoosing.addItem("Blue");
        colorChoosing.addItem("Red");
        frame.add(colorChoosing);

        textArea = new JTextArea(2, 23);
        textArea.setForeground(Color.BLACK);
        textArea.setFont(new Font("Times New Roman", Font.BOLD, 15));
        frame.add(textArea);

        fontChoosing.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (fontChoosing.getSelectedIndex()==0) {
                    textArea.setFont(new Font("Times New Roman",Font.BOLD, 15));
                }
                else if (fontChoosing.getSelectedIndex()==1) {
                    textArea.setFont(new Font("MS Sans Serif", Font.BOLD, 15));
                }
                else if (fontChoosing.getSelectedIndex()==2) {
                    textArea.setFont(new Font("Courier New", Font.BOLD, 15));
                }
            }
        });

        colorChoosing.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (colorChoosing.getSelectedIndex()==0) {
                    textArea.setForeground(Color.BLACK);
                }
                else if (colorChoosing.getSelectedIndex()==1) {
                    textArea.setForeground(Color.BLUE);
                }
                else if (colorChoosing.getSelectedIndex()==2) {
                    textArea.setForeground(Color.RED);
                }

            }
        });

        getContentPane().add(frame);
        setPreferredSize(new Dimension(300, 150));
    }

    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {}
    }

    public static void main(String[] args) {
        new Application();
    }
}