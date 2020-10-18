package ru.PolukarovIvan.lab_10;

import java.util.Scanner;

public class ex8 {

    public static Boolean isPalindrome(String s) {
        return s.equals((new StringBuilder(s)).reverse().toString());
    }
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        String s = In.next();

        System.out.println(isPalindrome(s));

    }
}
