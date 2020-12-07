package ru.PolukarovIvan.lab_21.ex3;

public interface IDocument {
    public String toString();

    public default void close(){
        System.out.println("Closed");
    }

    public default void save(){
        System.out.println("Saved");
    }
}
