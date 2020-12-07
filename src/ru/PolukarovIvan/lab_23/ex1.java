package ru.PolukarovIvan.lab_23;

import java.util.HashMap;
import java.util.Map;

public class ex1 {
    public static void main(String[] args) {

        Map<String, String> d1 = new HashMap<>();

        d1.put("Ivan", "P1");
        d1.put("Ivan", "P1");
        d1.put("Ivan", "P2");
        d1.put("Ivan", "P2");
        d1.put("Ksusha", "A");

        System.out.println(d1);

        Map<String, String> d2 = new HashMap<>();
        for (String key : d1.keySet()) {
            String value = d1.get(key);
            if (!d2.containsValue(value))
                d2.put(key, value);
        }
        System.out.println(d2);
    }

}