package ru.PolukarovIvan.lab_10;

import java.util.Scanner;

public class ex4 {
    public static int recursion(int len, int sum, int k, int s) {
        // Базовый случай
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        // Шаг рекурсии / рекурсивное условие
        for (int i = c; i < 10; i++) {
            res += recursion(len + 1, sum + i, k, s);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        int a = In.nextInt();
        int b= In.nextInt();

        System.out.println(recursion(0,0,a,b));
    }
}