package ru.PolukarovIvan.lab_01.ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner In = new Scanner(System.in);

        System.out.println("Enter number elements: ");

        int size = In.nextInt();

        int[] arr = new int[size];

        int sum = 0;

        for (int i =0;i<size; i++){
            arr[i] = In.nextInt();
            sum += arr[i];
        }

        System.out.println("Size of your array is: " + sum);
    }

}
