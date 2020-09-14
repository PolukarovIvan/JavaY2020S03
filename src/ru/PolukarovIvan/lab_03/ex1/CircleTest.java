package ru.PolukarovIvan.lab_03.ex1;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(0, new Point(0,0));

        System.out.println(c1.toString());

        c1.setCenter(new Point(1, -1));

        System.out.println(c1.toString());

        c1.setRadius(10);

        System.out.println(c1.toString());
    }
}
