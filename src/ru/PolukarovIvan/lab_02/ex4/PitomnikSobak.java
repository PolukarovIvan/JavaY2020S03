package ru.PolukarovIvan.lab_02.ex4;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class PitomnikSobak {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);

        System.out.println("Enter number of dogs: ");

        int n = In.nextInt();

        Dog[] dogs = new Dog[n];

        for (int i = 0; i< n; i++){
            dogs[i] = new Dog();
        }

        //Dog dog = new Dog();

        //System.out.println(dogs[0].toString());


        dogs[0].setAge(10);
        dogs[0].setName("test1");

        dogs[1].setAge(3);
        dogs[1].setName("test2");

        for(Dog dog : dogs){
            System.out.println(dog.toString());
        }


    }
}

