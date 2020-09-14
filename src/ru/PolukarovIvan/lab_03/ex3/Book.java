package ru.PolukarovIvan.lab_03.ex3;

public class Book {
    private final String authoor;
    private final String title;
    private final int year;

    public Book(String author, String title, int year) {
        this.authoor = author;
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString(){
        return "Book: \nAuthor = " + authoor + ",\nTitle = " + title + ",\nYear = " + year;
    }

}
