package ru.PolukarovIvan.lab_04.ex1;

public class ShapeTest {
    public static void main(String[] args) {

        Shape[] shapes = {new Circle(10), new Rectangle(10, 2), new Square()};

        for(Shape shape : shapes){
            System.out.println(shape.toString());
        }

    }
}
