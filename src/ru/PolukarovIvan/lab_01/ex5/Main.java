package ru.PolukarovIvan.lab_01.ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);

        int x = In.nextInt();

        Factorial obj = new Factorial(x);

        System.out.println(obj.getFactorial());
    }
}
