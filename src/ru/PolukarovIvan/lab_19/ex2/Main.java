package ru.PolukarovIvan.lab_19.ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Ivan";
        names[1] = "Someone";
        names[2] = "Abraham";
        ArrayList<Student> students = new ArrayList<Student>(3);

        for (Student s : students) {
            System.out.println(s.toString());
        }

        for (int i = 0; i < 3; i++) {
            students.add(new Student(i, (int) (Math.random() * 100), names[i]));
        }

        Scanner In = new Scanner(System.in);
        String name = In.nextLine();

        System.out.println("Searching " + name + "...");

        Collections.sort(students, new SortByFullName());

        Student ans = null;

        for(Student student: students){
            if(student.getFullName().equals(name)){
                ans = student;
            }
        }

        if(ans != null){
            System.out.println(ans.toString());
        } else{
            System.out.println("Not found!");
        }



    }

}