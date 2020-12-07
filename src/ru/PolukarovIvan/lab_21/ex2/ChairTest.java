package ru.PolukarovIvan.lab_21.ex2;

import java.util.ArrayList;

public class ChairTest {
    public static void main(String[] args) {

        ArrayList<Chair> chairArrayList = new ArrayList(3);

        System.out.println(chairArrayList.size());

        chairArrayList.add(new MagicChair());
        chairArrayList.add(new VictorianoChair());
        chairArrayList.add(new MultifunctionalChair());

        for(Chair chair : chairArrayList){
            chair.sit();
        }
    }
}