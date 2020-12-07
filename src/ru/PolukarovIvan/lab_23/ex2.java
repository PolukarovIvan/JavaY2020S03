package ru.PolukarovIvan.lab_23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ex2 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> d = new HashMap<>();
        add(d, "Russia", "Moscow");
        add(d, "Russia", "Murmansk");
        add(d, "Russia", "Norilsk");
        add(d, "Russia", "Tomsk");
        add(d, "Russia", "Omsk");
        add(d, "USA", "Portland");
        add(d, "USA", "New York");
        add(d, "USA", "Washington");
        add(d, "GB", "London");

        System.out.println(d);
    }
    public static void add(HashMap<String, ArrayList<String>> map,
                           String country,
                           String sity){
        if(!map.containsKey(country)){
            map.put(country, new ArrayList<String>());
        }
        map.get(country).add(sity);
    }


}
