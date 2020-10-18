package ru.PolukarovIvan.lab_10;

import java.util.Scanner;

public class ex9 {
    public static int recOnesAndZeroes(int zeroes, int ones){

        if (zeroes > ones + 1) {
            return 0;
        }
        if(zeroes == 0 || ones == 0){
            return 1;
        }
        return recOnesAndZeroes(zeroes, ones - 1) + recOnesAndZeroes(zeroes -1, ones - 1);
    }
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);

        int zeroes = In.nextInt();
        int ones = In.nextInt();

        System.out.println(recOnesAndZeroes(zeroes, ones));

    }
}
