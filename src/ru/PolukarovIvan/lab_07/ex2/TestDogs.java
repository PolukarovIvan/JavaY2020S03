package ru.PolukarovIvan.lab_07.ex2;

public class TestDogs {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Bulldog(20);
        dogs[1] = new Dachshund(5);
        dogs[2] = new Spitz(4);

        for(Dog dog : dogs){
            System.out.println(dog.toString());
            dog.Bark();
        }

    }


}
