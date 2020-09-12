package ru.PolukarovIvan.lab_02.ex3;

public class Book {

    private final String name;
    private final int pages;
    private final double weight;
    private final double score;

    public Book(String name, int pages, double weight, double score){
        this.name = name;
        this.pages = pages;
        this.weight = weight;
        this.score = score;
    }
    @Override
    public String toString(){
        return "Book: \nName = " + name + "\nPages = "+ pages + "\nWeight = " + weight + "\nScore = " + score;
    }
}
