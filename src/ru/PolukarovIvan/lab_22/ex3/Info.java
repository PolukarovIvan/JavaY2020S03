package ru.PolukarovIvan.lab_22.ex3;

import java.util.Date;

public class Info {
    private String name;
    private Date start;
    private Date finish;

    public Info(String name) {
        this.name = name;
    }

    public void setStart(){
        this.start = new Date();
    }

    public void setFinish(){
        this.finish = new Date();
    }

    public String getName() {
        return name;
    }

    public Date getStart() {
        return start;
    }

    public Date getFinish() {
        return finish;
    }

    @Override
    public String toString() {
        return "Info{" +
                "name='" + name + '\'' +
                ", start=" + start +
                ", finish=" + finish +
                '}';
    }
}
