package ru.PolukarovIvan.lab_10;

import java.util.Scanner;

public class ex12 {
    public static void rec_foo(){

        Scanner In = new Scanner(System.in);
        int n = In.nextInt();

        if(n == 0){
            return;
        }

        if(n % 2 == 0)
            System.out.println(n);
        rec_foo();

    }
    public static void main(String[] args) {
        rec_foo();
    }
}
