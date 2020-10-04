package ru.PolukarovIvan.lab_07.ex2;

public class Bulldog extends Dog {
    public Bulldog(float weight) {
        super(weight);
    }

    @Override
    public String
    toString() {
        return "Bulldog{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public void Bark() {
        System.out.println("Baaaaarak-Baaaark");
    }
}
