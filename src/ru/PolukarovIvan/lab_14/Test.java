package ru.PolukarovIvan.lab_14;

import ru.PolukarovIvan.lab_13.Student;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student(0, 100);
        Student student2 = new Student(0, 100);

        ArrayList<Student> students = new ArrayList<Student>(10);

        for (int i = 0; i < 10; i++) {
            students.add(new Student(i, (int) (Math.random() * 100)));
            System.out.println(students.get(i).toString());
        }
        Student randomStudent = students.get((int) (Math.random() * 10));

        Search search = new Search(students, randomStudent, "recursive");

        int result = search.binarySearch();

        System.out.println("Ans: " + students.get(result) + " Result: " + randomStudent.toString());

        search = new Search(students, randomStudent, "iteration");

        result = search.binarySearch();

        System.out.println("Ans: " + students.get(result) + " Result: " + randomStudent.toString());
    }

}
