package ru.PolukarovIvan.lab_30;

import java.io.Serializable;

public class Drink extends MenuItem implements Alcoholic, Serializable {
    private boolean alcoholic;
    public Drink(int cost, String name, String description, boolean alcoholic) {
        super(cost, name, description);
    }

    @Override
    public boolean isAlcoholic() {
        return alcoholic;
    }

    public boolean getAlcoholic() {
        return alcoholic;
    }
}
