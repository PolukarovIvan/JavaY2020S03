package ru.PolukarovIvan.lab_07.ex1;

public class TestDishes {
    public static void main(String[] args) {

        Dish[] table = new Dish[2];
        table[1] = new Cup(true, 200);
        table[0] = new Plate(false, 20);

        for(Dish dish : table){
            System.out.println(dish.toString());
        }

        for(Dish dish : table){
            dish.wash();
        }

        for(Dish dish : table){
            System.out.println(dish.toString());
        }

        for(Dish dish : table){
            dish.fill();
        }

        for(Dish dish : table){
            System.out.println(dish.toString());
        }
    }
}
