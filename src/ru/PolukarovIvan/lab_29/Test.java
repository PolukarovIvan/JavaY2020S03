package ru.PolukarovIvan.lab_29;

public class Test {
    public static void main(String[] args) {
        InternetOrder internetOrder = new InternetOrder();
        internetOrder.add(new Dish("Roasted Chicken", "1.0kg", 1000));
        internetOrder.add(new Dish("Roasted Fish", "1.0kg", 900));
        internetOrder.add(new Drink("B52", "300ml", 250));
        internetOrder.add(new Dish("Orange Juice", "500ml", 100));

        for(String item : internetOrder.itemsNames()){
            System.out.println(item.toString());
        }


    }
}
