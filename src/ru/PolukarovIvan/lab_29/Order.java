package ru.PolukarovIvan.lab_29;

public interface Order {

    boolean add(Item item);

    String[] itemsNames();

    int size();

    int find(String itemName);

    Item[] getItems();

    boolean remove(String itemName);

    int index(String itemName);

    Item[] sortedItemByCostDesc();

    int costTotal();

}