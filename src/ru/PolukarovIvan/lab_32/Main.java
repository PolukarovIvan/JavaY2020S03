package ru.PolukarovIvan.lab_32;

import ru.PolukarovIvan.lab_30.*;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        InternetOrder internetOrder = new InternetOrder();
        internetOrder.add(
                new Drink(
                        100,
                        "Coffee",
                        "Latte",
                        false
                )
        );
        internetOrder.add(
                new Drink(
                        100,
                        "Vodka",
                        "42%",
                        true
                )
        );
        internetOrder.add(
                new Dish(
                        100,
                        "Fish",
                        "500g"
                )
        );

        internetOrder.setCustomer(
                new Customer(
                        "Ivan",
                        "Polukarov",
                        18,
                        new Address(
                                "Moscow",
                                12323124,
                                "Pushkina",
                                12,
                                3
                        )
                )
        );

        InternetOrdersManager ordersManager = new InternetOrdersManager();
        ordersManager.add(internetOrder);

        FileOutputStream fileOutputStream = new FileOutputStream("test.dump");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(ordersManager);
        objectOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("test.dump");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ordersManager = (InternetOrdersManager) objectInputStream.readObject();
        objectInputStream.close();
    }
}