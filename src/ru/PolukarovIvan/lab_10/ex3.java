package ru.PolukarovIvan.lab_10;

import java.util.Scanner;

public class ex3 {
    public static void printSequence(int a, int b){
        for(int i = a; i <= b; i++){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);

        int a = In.nextInt();
        int b = In.nextInt();

        if(b > a) {
            printSequence(a, b);
        } else{
            printSequence(b, a);
        }
    }
}
