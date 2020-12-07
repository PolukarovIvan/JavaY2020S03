package ru.PolukarovIvan.lab_21.ex1;

public class MyComplex {
    private double reZ;
    private double imZ;

    public MyComplex() {
        this.imZ = 0;
        this.reZ = 0;

    }

    public MyComplex(double reZ, double imZ) {
        this.reZ = reZ;
        this.imZ = imZ;
    }

    @Override
    public String toString() {
        return "MyComplex{" +
                "Real part = " + reZ +
                ", Imaginary part = " + imZ +
                '}';
    }

    public double getReZ() {
        return reZ;
    }

    public void setReZ(double reZ) {
        this.reZ = reZ;
    }

    public double getImZ() {
        return imZ;
    }

    public void setImZ(double imZ) {
        this.imZ = imZ;
    }
}
