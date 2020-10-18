package ru.PolukarovIvan.lab_10;

import java.util.Scanner;

public class ex17 {
    public static void rec_foo(int max, int counter){
        Scanner In = new Scanner(System.in);
        int n = In.nextInt();
        if(n != 0){
            if(n == max){
                rec_foo(max, counter + 1);
            } else if(n > max){
                rec_foo(n,1);
            }
        }
        else{
            System.out.println("Max: "+ max);
        }
    }
    public static void main(String[] args) {
        rec_foo(0,0);
    }
}
