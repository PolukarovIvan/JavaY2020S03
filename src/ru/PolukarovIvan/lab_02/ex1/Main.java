package ru.PolukarovIvan.lab_02.ex1;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(new Point(0,0), 1, Color.BLACK);

        circle.getArea();

        System.out.println(circle.getArea());

        //Triangle triangle = new Triangle(new Point(0,0), new Point (1,2), new Point(2,8), Color.RED);

        Square square = new Square(new Point(0,0), 1, Color.WHITE);

        Shape[] shapes = {circle, square};

        for (Shape shape: shapes){
            System.out.println(shape.toString());
            //shape.toString();
        }
    }
}
