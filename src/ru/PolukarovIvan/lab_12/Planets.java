package ru.PolukarovIvan.lab_12;

public enum Planets {

    Mercury(2440 * 1e3, 3.33 * 1e23),
    Venus(6050 * 1e3, 4.88 * 1e24),
    Earth(6370 * 1e3, 5.976 * 1e24),
    Mars(3390 * 1e3, 6.43 * 1e23),
    Jupiter(71490 * 1e3, 1.9 * 1e27),
    Saturn(60270 * 1e3, 5.69 * 1e26),
    Uranus(25560 * 1e3, 8.69 * 1e27),
    Neptune(24760 * 1e3, 1.04 * 1e26);

    public double radius;
    public double mass;

    Planets(double radius, double mass) {
        this.radius = radius;
        this.mass = mass;
    }



}