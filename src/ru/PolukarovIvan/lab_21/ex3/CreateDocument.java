package ru.PolukarovIvan.lab_21.ex3;

import java.util.IdentityHashMap;

public class CreateDocument implements IDocument, ICreateDocument {
    public CreateDocument(boolean open) {
        if (open) createOpen();
        else createNew();
    }

    @Override


    public IDocument createNew() {
        IDocument document = new Text() {};
        System.out.println("Creating...");
        return document;

    }

    @Override
    public IDocument createOpen() {
        IDocument document = createNew();
        System.out.println("Opening...");
        return document;
    }



}
