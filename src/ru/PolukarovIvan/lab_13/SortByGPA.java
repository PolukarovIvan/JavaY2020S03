package ru.PolukarovIvan.lab_13;

import java.util.Comparator;

public class SortByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAvg() > o2.getAvg() ? 1 : (o1.getAvg() == o2.getAvg()) ? 0 : -1;
    }

    @Override
    public Comparator<Student> reversed() {
        return null;
    }
}
