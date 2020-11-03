package ru.PolukarovIvan.lab_13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>(5);

        for (Student s : students) {
            System.out.println(s.toString());
        }

        for (int i = 0; i < 5; i++) {
            students.add(new Student(i, (int) (Math.random() * 100)));
        }

        Collections.sort(students, new SortByGPA());

        for (Student s : students) {
            System.out.println(s.toString());
        }
    }
}
