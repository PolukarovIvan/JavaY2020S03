package ru.PolukarovIvan.lab_01.ex5;

public class Factorial {

    private int x = 1;

    public Factorial(int x){
        this.x = x;
    }
    public final int getFactorial(){

        int num = 1;
        for(int i = 1; i <= this.x; i++){
            num *= i;
        }
        return num;
    }
}
