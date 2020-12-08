package ru.PolukarovIvan.lab_25.ex4;

import ru.PolukarovIvan.lab_25.ex3.Ipv4Check;

public class Test {

    public static void main(String[] args) {

        String [] strings = {
                "(1 + 1) + (1) - ((2))",
                "(33)",
                "((3313",
                "((123123))) - 10))",
                "))123123((",
                "(22) * 11))",
                "((3*+*5)*–*9*×*4)"
        };

        for (int i = 0; i < strings.length; i++) {
            System.out.println(String.valueOf(i) + ") " + strings[i] + " " + String.valueOf(BracketCheck.check(strings[i])));
        }
    }
}
