package ru.PolukarovIvan.lab_22.ex2;

public class Date {
    private String date;
    private String d;
    private String m;
    private String y;

    public Date(String date) {
        this.date=date;
        String[] str = date.split(">");
        d = str[0].substring(1);
        m = str[1].substring(1);
        y = str[2].substring(1);

    }

    @Override
    public String toString() {
        return "Date {" +
                "day = '" + d + '\'' +
                ", month = '" + m + '\'' +
                ", year = '" + y + '\'' +
                '}';
    }

}