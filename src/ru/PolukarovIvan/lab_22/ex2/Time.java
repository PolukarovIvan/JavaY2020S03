package ru.PolukarovIvan.lab_22.ex2;


public class Time {
    private final String calendar;
    private String h;
    private String m;

    public Time(String calendar) {
        this.calendar = calendar;
        String[] str = calendar.split(">");
        h = str[0].substring(1);
        m = str[1].substring(1);
    }

    @Override
    public String toString() {
        return "Time {" +
                "hour = '" + h + '\'' +
                ", min = '" + m + '\'' +
                '}';
    }

}