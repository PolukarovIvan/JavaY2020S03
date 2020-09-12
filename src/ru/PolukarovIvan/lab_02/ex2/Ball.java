package ru.PolukarovIvan.lab_02.ex2;

public class Ball {

    private final double weight;
    private final Type type;
    private final Color color;

    public Ball(int weight, Type type, Color color){
        this.weight = weight;
        this.type = type;
        this.color = color;
    }

    @Override
    public String toString(){
        return "Ball: \nType = " + type + "\nWeight = " + weight + "\nColor = " + color;
    }

}
