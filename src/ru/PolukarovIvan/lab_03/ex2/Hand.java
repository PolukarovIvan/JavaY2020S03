package ru.PolukarovIvan.lab_03.ex2;

public class Hand {
    private final Dir dir;
    public Hand(Dir dir){
        this.dir = dir;
    };

    public String getDir(){
        return dir.name();
    }
}
