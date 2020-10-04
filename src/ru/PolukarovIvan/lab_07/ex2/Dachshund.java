package ru.PolukarovIvan.lab_07.ex2;

public class Dachshund extends Dog {
    public Dachshund(float weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Dachshund{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public void Bark() {
        System.out.println("Bark");
    }
}
