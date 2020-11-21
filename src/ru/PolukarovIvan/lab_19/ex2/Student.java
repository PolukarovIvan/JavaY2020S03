package ru.PolukarovIvan.lab_19.ex2;

import java.util.Objects;

public class Student{
    private int id;
    private double average;
    private String fullName;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", average=" + average +
                ", fullName='" + fullName + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Student(int id, double average, String fullName) {
        this.id = id;
        this.average = average;
        this.fullName = fullName;
    }


}
