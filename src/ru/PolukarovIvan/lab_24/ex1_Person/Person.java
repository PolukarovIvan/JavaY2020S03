package ru.PolukarovIvan.lab_24.ex1_Person;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Person {

    private String[] addressKeys = {"Country", "Reg", "City", "St", "House", "Building", "Apartment"};
    private String[] nameKeys = {"F", "I", "O"};
    private HashMap<String, String> address = new HashMap<>();
    private HashMap<String, String> fullName = new HashMap<>();

    public Person(String name, String sep) {
        setFullName(name, sep);
    }

    public HashMap<String, String> getAddress() {
        return address;
    }

    public HashMap<String, String> getFullName() {
        return fullName;
    }

    public Person(String name, String address, String sep) {
        setFullName(name, sep);
        setAddress(address, sep);
    }

    private void add(HashMap<String, String> dict, String[] keys, String[] values) {
        for (int i = 0; i < values.length; i++) {
            dict.put(keys[i], values[i]);
        }
    }

    public void setFullName(String name, String sep) {
        add(this.fullName, this.nameKeys, name.split(sep));
    }

    public void setAddress(String address, String sep) {
        add(this.address, this.addressKeys, address.split(sep));
    }


}
