package ru.PolukarovIvan.lab_14;

import ru.PolukarovIvan.lab_13.SortByGPA;
import ru.PolukarovIvan.lab_13.Student;

import java.util.ArrayList;
import java.util.Collections;

public class Search {
    private ArrayList<Student> students;
    private String searchType = "recursion";
    private Student student;
    private boolean sorted = false;

    public Search(ArrayList<Student> students, Student student) {
        this.students = students;
        this.student = student;
        this.searchType = "iteration";
    }

    public Search(ArrayList<Student> students, Student student, String searchType) {
        this.students = students;
        this.searchType = searchType;
        this.student = student;

    }

    public boolean isSorted() {
        return sorted;
    }

    public void setSorted(boolean sorted) {
        this.sorted = sorted;
    }

    private int binarySearchRecursion(int low, int high) {

        int mid = (low + high) / 2;
        if (low > high) {
            return -1;
        }

        if (this.students.get(mid).getAvg() < student.getAvg()) {
            low = mid + 1;

        } else if (this.students.get(mid).getAvg() > student.getAvg()) {
            high = mid - 1;

        } else if (this.students.get(mid).getAvg() == student.getAvg()) {
            return mid;
        }

        return binarySearchRecursion(low, high);
    }

    public int binarySearch() {
        if (!this.sorted) {
            System.out.println("Sorted!");
            Collections.sort(students, new SortByGPA());
            this.sorted = true;
        }
        if (this.searchType == "recursive") {
            System.out.println("Recursive method: ");
            return binarySearchRecursion(0, students.size() - 1);
        }
        System.out.println("Iteration method: ");
        return binarySearchIter();
    }

    private int binarySearchIter() {
        int index = -1;
        int begin = 0;
        int end = students.size() - 1;
        while (begin <= end) {
            int mid = (begin + end) / 2;

            if (students.get(mid).getAvg() < student.getAvg()) {
                begin = mid + 1;
            } else if (students.get(mid).getAvg() > student.getAvg()) {
                end = mid - 1;
            } else if (students.get(mid).getAvg() == student.getAvg()) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public int linearSearch() {
        for (int i = 0; i < students.size(); i++) {
            if (student.equals(students.get(i))) {
                return i;
            }
        }
        return -1;
    }
}
