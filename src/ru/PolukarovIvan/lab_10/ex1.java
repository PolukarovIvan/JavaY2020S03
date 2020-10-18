package ru.PolukarovIvan.lab_10;

import javax.management.StringValueExp;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);

        int number = In.nextInt();

        int k = 0;
        for(int i = 1; i < number;){
            System.out.print(i + " ");
            k++;
            if(i == k){
                k = 0;
                i++;
            }
        }
    }
}
