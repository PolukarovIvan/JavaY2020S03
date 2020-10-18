package ru.PolukarovIvan.lab_10;

import java.util.Scanner;

public class ex10 {
    public static void reverse(int a){
        System.out.print(a%10);
        if(a < 10) return;
        reverse(a/10);
    }

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        int n = In.nextInt();
        reverse(n);
    }
}
