package ru.PolukarovIvan.lab_22.ex1;

import ru.PolukarovIvan.lab_19.ex2.Student;

public class ExtendedStudent extends Student {

    String date;

    public String getDate() {
        return date;
    }

    public ExtendedStudent(int id, double average, String fullName) {
        super(id, average, fullName);
    }

    private String formatDatePart(int p){
        String s = "";
        if (p < 10) s += "0";
        return s + String.valueOf(p);
    }

    public void setDate(int d, int m, int y){
        date = formatDatePart(d) + "." + formatDatePart(m) + "." + formatDatePart(y);
    }

}
