package ru.PolukarovIvan.lab_29;

public final class Drink implements Item {

    private String name;
    private String description;
    private int price;

    public Drink(String name, String description, int price) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name can't be empty");
        }
        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("Description can't be empty");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price can't be less than 0");
        }
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int getPrice() {
        return price;
    }
}