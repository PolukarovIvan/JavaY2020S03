package ru.PolukarovIvan.lab_22.ex1;

public class Test {

    public static void main(String[] args) {
        ExtendedStudent student = new ExtendedStudent(1, 2.0, "Ivan");
        student.setDate(1, 1, 1);
        System.out.println(student.getDate());
    }
}
