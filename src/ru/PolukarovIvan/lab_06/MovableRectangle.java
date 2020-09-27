package ru.PolukarovIvan.lab_06;

import ru.PolukarovIvan.lab_05.Movable;
import ru.PolukarovIvan.lab_05.MovablePoint;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint downRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint downRight) {
        this.topLeft = topLeft;
        this.downRight = downRight;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "dl=" + topLeft.toString() +
                ", ur=" + downRight.toString() +
                '}';
    }

    public boolean equalSpeed(){
        return (topLeft.getxSpeed() == downRight.getxSpeed()) &&
                (topLeft.getySpeed() == downRight.getySpeed());
    }


    @Override
    public void moveUp() {
        if (equalSpeed()) {
            topLeft.moveUp();
            downRight.moveUp();
        }else System.out.println("Speed is not equal!");
    }

    @Override
    public void moveDown() {
        if (equalSpeed()) {
            topLeft.moveDown();
            downRight.moveDown();
        }else System.out.println("Speed is not equal!");

    }

    @Override
    public void moveRight() {
        if (equalSpeed()) {
            topLeft.moveRight();
            downRight.moveRight();
        }else System.out.println("Speed is not equal!");
    }

    @Override
    public void moveLeft() {
        if (equalSpeed()) {
            topLeft.moveLeft();
            downRight.moveLeft();
        }else System.out.println("Speeds are not equal!");
    }
}
