package ru.PolukarovIvan.lab_21.ex1;

public class ComplexTest {
    public static void main(String[] args) {
        MyComplex zero = new MyComplex();
        MyComplex complex = new MyComplex(1, 1);
        complex.setImZ(10);

        System.out.println(zero.toString());
        System.out.println(complex.toString());
    }
}
