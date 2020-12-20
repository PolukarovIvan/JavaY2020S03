package ru.PolukarovIvan.lab_30;

import ru.PolukarovIvan.lab_19.ex2.SortByFullName;

import java.sql.SQLOutput;

public class Test {

    public static void main(String[] args) {
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
                                "Moskow",
                                12323124,
                                "Pushkina",
                                12,
                                3
                        )
                )
        );

        InternetOrdersManager ordersManager = new InternetOrdersManager();
        ordersManager.add(internetOrder);

        System.out.println(ordersManager.ordersCostSummary());
        System.out.println(internetOrder.toString());
    }

}