package ru.PolukarovIvan.lab_07.ex2;

public abstract class Dog {
    protected float weight;

    public Dog(float weight){
        this.weight = weight;
    }

    @Override
    public abstract String toString();

    public abstract void Bark();
}
