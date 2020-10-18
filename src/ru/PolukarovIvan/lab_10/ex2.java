package ru.PolukarovIvan.lab_10;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);

        int n = In.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print((i +1) + " ");
        }
    }
}
