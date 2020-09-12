package ru.PolukarovIvan.lab_01.ex4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Random rand = new Random();

    public static int getRandomIntMath()
    {
        return (int) (Math.random() * 100);
    }

    public static int getRandomIntRand(){
        return Math.abs(rand.nextInt())%100;
    }

    public static void main(String[] args) {

        Scanner In = new Scanner(System.in);


        System.out.println("Enter the array's size: ");
        int n = In.nextInt();

        int[] arr1 = new int[n];

        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++){
            arr1[i] = getRandomIntMath();
            arr2[i] = getRandomIntRand();
        }

        System.out.print("Math:");
        for(int i = 0; i< n; i++){
            System.out.print(" " + arr1[i]);
        }

        System.out.print("\nRand:");
        for(int i = 0; i< n; i++){
            System.out.print(" " + arr2[i]);
        }

        Arrays.sort(arr1);

        System.out.print("\nMath sorted:");
        for(int i = 0; i< n; i++){
            System.out.print(" " + arr1[i]);
        }


        Arrays.sort(arr2);

        System.out.print("\nRand sorted:");
        for(int i = 0; i< n; i++) {
            System.out.print(" " + arr2[i]);
        }

    }
}
