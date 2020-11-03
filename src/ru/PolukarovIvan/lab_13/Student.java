package ru.PolukarovIvan.lab_13;

public class Student {
    private  int id;
    private double avg;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", avg=" + avg +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public int getId() {
        return id;
    }

    public double getAvg() {
        return avg;
    }

    public Student(int id, double avg) {
        this.id = id;
        this.avg = avg;
    }
}
