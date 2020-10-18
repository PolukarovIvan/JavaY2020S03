package ru.PolukarovIvan.lab_10;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class ex14 {
    public static void rec_foo(int a){
       if(a < 10){
           System.out.println(a);
           return;
       }
       rec_foo(a /10);
        System.out.println(a % 10);
    }

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        rec_foo(In.nextInt());
    }
}
