package ru.PolukarovIvan.lab_22.ex2;

public class Test {
    public static void main(String[] args) {
        Date date = new Date("<01><01><2021>");
        Time time = new Time("<23><59>");
        System.out.println(date.toString());
        System.out.println(time.toString());
    }
}
