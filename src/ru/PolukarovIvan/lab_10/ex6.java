package ru.PolukarovIvan.lab_10;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class ex6 {

    public static boolean isPrime(int a, int n){
        if(a < 2) {
            return false;
        }
        if( a == 2){
            return true;
        }
        if(a % n == 0){
            return false;
        }
        if(n*n < a){
            return isPrime(a, n+1);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);

        int a = In.nextInt();

        if(isPrime(a,2 )){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
