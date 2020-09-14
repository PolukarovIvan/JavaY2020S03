package ru.PolukarovIvan.lab_03.ex2;

public class Human {
    private final Hand rightHand;
    private final Hand leftHand;

    private final Leg rightLeg;
    private final Leg leftLeg;

    private final Head head;

    public Human(Hand rightHand, Hand leftHand,
                 Leg rightLeg, Leg leftLeg,
                 Head head){
        this.head = head;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
    }
    @Override
    public String toString(){
        return "Human: { Hands: " + rightHand.getDir()+ ", "+ leftHand.getDir() + "; Legs: " +
                rightLeg.getDir() + ", " + leftLeg.getDir() + "; Head: Iq =  "+ head.getIq() + " }";
    }

}
