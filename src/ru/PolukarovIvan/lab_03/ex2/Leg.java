package ru.PolukarovIvan.lab_03.ex2;

public class Leg {
    private final Dir dir;
    public Leg(Dir dir){
        this.dir = dir;
    };
    public String getDir(){
        return dir.name();
    }
}
