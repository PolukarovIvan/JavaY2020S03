package ru.PolukarovIvan.lab_10;

import java.util.Scanner;

public class ex5 {

    public static int rec_sum(int a){
        if( a < 10){
            return a;
        }
        return a % 10 + rec_sum(a / 10);
    }

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        int number = In.nextInt();

        System.out.println(rec_sum(number));

    }
}
