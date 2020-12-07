package ru.PolukarovIvan.lab_21.ex3;

public class Test {
    public static void main(String[] args) {

        CreateDocument textbook = new CreateDocument(true);
        textbook.save();
        textbook.close();

        CreateDocument textbook2 = new CreateDocument(false);
    }
}