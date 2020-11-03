package ru.PolukarovIvan.lab_13;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Double.compare(student.avg, avg) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, avg);
    }
}
