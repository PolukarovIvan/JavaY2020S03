package ru.PolukarovIvan.lab_21.ex2;

public class Client {
    private String name;
    private int age;

    private void sit(Chair chair){
        chair.sit();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Client() {
        this.name = "Unknown";
        this.age = Integer.parseInt(null);
    }

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
