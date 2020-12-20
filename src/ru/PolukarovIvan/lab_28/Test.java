package ru.PolukarovIvan.lab_28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Test {
    private static Map<String, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static IPay card;


    public static void main(String[] args) throws IOException {
        priceOnProducts.put("Apple", 22);
        priceOnProducts.put("Orange", 21);
        priceOnProducts.put("RedBull", 110);
        priceOnProducts.put("Juice", 90);

        System.out.println("Shopping Cart: " + priceOnProducts.toString());

        card = new Pay();
        order.processOrder(card);

        try {
            order.setTotalCost(priceOnProducts.get("Apple"));
            order.setTotalCost(priceOnProducts.get("Orange"));
            order.setTotalCost(priceOnProducts.get("RedBull"));
            order.setTotalCost(priceOnProducts.get("Juice"));
            order.setTotalCost(priceOnProducts.get("Apple"));
            order.setTotalCost(priceOnProducts.get("Orange"));
            order.setTotalCost(priceOnProducts.get("RedBull"));
            order.setTotalCost(priceOnProducts.get("Juice"));
            order.setTotalCost(priceOnProducts.get("Apple"));
            order.setTotalCost(priceOnProducts.get("Orange"));
            order.setTotalCost(priceOnProducts.get("RedBull"));
            order.setTotalCost(priceOnProducts.get("RedBull"));
            order.setTotalCost(priceOnProducts.get("RedBull"));
            order.setTotalCost(priceOnProducts.get("RedBull"));
            order.setTotalCost(priceOnProducts.get("RedBull"));
            order.setTotalCost(priceOnProducts.get("Juice"));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Total order coast: " + order.getTotalCost());

    }

}