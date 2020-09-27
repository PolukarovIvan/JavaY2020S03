package ru.PolukarovIvan.lab_05;

public class Test {
    public static void main(String[] args) {

        Movable movablePoint = new MovablePoint(0,0, 1,1);
        Movable movableCircle = new MovableCircle(10, (MovablePoint) movablePoint);

        System.out.println(movableCircle.toString());

        movableCircle.moveUp();
        movableCircle.moveRight();

        System.out.println(movableCircle.toString());

        movablePoint.moveUp();
        movablePoint.moveRight();
        movablePoint.moveUp();
        movablePoint.moveRight();

        System.out.println(movablePoint.toString());

        System.out.println(movableCircle.toString());
    }
}
