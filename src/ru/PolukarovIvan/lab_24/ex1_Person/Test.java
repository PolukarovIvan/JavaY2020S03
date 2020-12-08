package ru.PolukarovIvan.lab_24.ex1_Person;

import java.util.Arrays;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        Person person = new Person("Polukarov I S",  " ");
        System.out.println(person.getFullName());
        person.setAddress("Russia, Moskow oblast, Moscow, Lazareva St., 19, 2, 100", ", ");
        System.out.println(person.getFullName());
        System.out.println(person.getAddress());
    }
}
