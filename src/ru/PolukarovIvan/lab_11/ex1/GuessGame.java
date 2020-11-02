package ru.PolukarovIvan.lab_11.ex1;

import javax.swing.*;

public class GuessGame {

    int attempt = 0, n = 7, random = (int)(Math.random() * n);

    public GuessGame() {
        JTextField textField = new JTextField();
        JTextArea condition = new JTextArea();
        JButton button = new JButton("Guess the number from 0 to " + (n - 1));
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        button.addActionListener(e -> {

            int userGuess = Integer.parseInt(textField.getText());
            if (userGuess == random) {
                JFrame loseFrame = new JFrame();
                loseFrame.add(new JTextArea("You win)))))))))!"));
                frame.setVisible(false);
                loseFrame.setVisible(true);
            } else {
                attempt++;
                if (attempt == 3) {
                    JFrame loseFrame = new JFrame();
                    loseFrame.add(new JTextArea("You lose((((((!"));
                    frame.setVisible(false);
                    loseFrame.setVisible(true);
                } else {
                    textField.setText("");
                    if (userGuess > random) {
                        condition.setText("The answer is less than " + userGuess);
                    } else {
                        condition.setText("The answer is more than " + userGuess);
                    }
                }
            }

        });
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(textField);
        frame.add(button);
        frame.add(condition);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new GuessGame();
    }
}
