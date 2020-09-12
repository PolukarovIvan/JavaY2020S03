package ru.PolukarovIvan.lab_02.ex4;

public class Dog{

    private String name = "Abraham";
    private int age = 0;

    private static int count = 0;
    private int id = 0;

    public Dog(String name, int age){
        this.age = age;
        this.name = name;
        count++;
        this.id = count;
    }

   public Dog(){
        this.age = 0;
        this.name = "NA";
        count++;
        this.id = count;
   }

   public void setName(String name){
        this.name = name;
   }

   public void setAge(int age){this.age = age; }

   public String setName(){return name;}

   public int getAge(){return age;}

   public int getHumanAge(){return age * 7;}

   @Override
    public String toString(){
        return "Dog: {ID = " + id + ", Name = "+ name+", Age = "+age+ ", Human Age Convertor = " + getHumanAge() + "}";
   }


}
