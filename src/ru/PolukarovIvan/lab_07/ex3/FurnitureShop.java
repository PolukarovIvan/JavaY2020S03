package ru.PolukarovIvan.lab_07.ex3;

public class FurnitureShop {
    public static void main(String[] args) {
        Furniture[] furniture = new Furniture[3];

        furniture[0] = new Sofa(90000, 210, false);
        furniture[1] = new Cheer(1000, 10, false);
        furniture[2] = new Table(20000, 100, false);

        for (Furniture sth : furniture){
            System.out.println(sth.toString());
        }

        System.out.println("Selling...");

        for (Furniture sth : furniture){
            if(!sth.isSold()){
                sth.Sell();
                System.out.println(sth.toString() + "is sold!");
            }
            else{
                System.out.println(sth.toString() + "is already sold!");
            }
        }
    }
}

