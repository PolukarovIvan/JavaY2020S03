package ru.PolukarovIvan.lab_19.ex2;

import java.util.Comparator;

public class SortByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAverage()>o2.getAverage() ? 1 : (o1.getAverage()<o2.getAverage()) ? -1 : 0;
    }
}
