package ru.PolukarovIvan.lab_06;

import ru.PolukarovIvan.lab_02.ex1.Point;
import ru.PolukarovIvan.lab_05.Movable;
import ru.PolukarovIvan.lab_05.MovablePoint;

public class Test {
    public static void main(String[] args) {

        Movable goodRectangle = new MovableRectangle(new MovablePoint(1,1, 2,2),
                new MovablePoint(2,2,2,2));

        Movable badRectangle = new MovableRectangle(new MovablePoint(1,1, 2,2),
                new MovablePoint(2,2,2,3));

        System.out.println(goodRectangle.toString());
        goodRectangle.moveRight();
        System.out.println(goodRectangle.toString());

        System.out.println('\n');

        System.out.println(badRectangle.toString());
        badRectangle.moveRight();
        System.out.println(badRectangle.toString());



    }
}
