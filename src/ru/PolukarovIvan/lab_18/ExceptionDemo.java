package ru.PolukarovIvan.lab_18;

public class ExceptionDemo implements Runnable{
    @Override
    public void run() {
        int a = 1 / 0;
    }
}
