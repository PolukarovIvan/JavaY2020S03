package ru.PolukarovIvan.lab_07.ex2;

public class Spitz extends Dog{
    public Spitz(float weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Spitz{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public void Bark() {
        System.out.println("Brk");
    }
}
