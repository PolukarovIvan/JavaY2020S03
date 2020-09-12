package ru.PolukarovIvan.lab_01.ex2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner In = new Scanner(System.in);

        System.out.println("Enter number elements: ");

        int size = In.nextInt();

        int[] arr = new int[size];

        //int sum = 0;

        for (int i =0;i<size; i++){
            arr[i] = In.nextInt();
            //sum += arr[i];
        }

        for (int el : arr){
            System.out.print(el + " ");
        }

        //System.out.println("Size of your array is: " + sum);
    }

}
