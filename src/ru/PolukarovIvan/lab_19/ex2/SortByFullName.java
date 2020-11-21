package ru.PolukarovIvan.lab_19.ex2;

import java.util.Comparator;

public class SortByFullName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
}
