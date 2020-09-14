package ru.PolukarovIvan.lab_03.ex2;

public class HumanTest {
    public static void main(String[] args) {
        //Hand hand = new Hand(Dir.LEFT);
       // System.out.println(hand.getDir());

        Human ksenia = new Human(new Hand(Dir.LEFT), new Hand(Dir.RIGHT),
                new Leg(Dir.LEFT), new Leg(Dir.RIGHT), new Head(12));

        System.out.println(ksenia.toString());
    }
}
