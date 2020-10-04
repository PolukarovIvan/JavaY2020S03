package ru.PolukarovIvan.lab_07.ex1;

public class Cup extends Dish {

    private final int volume;

    public Cup(boolean clear, int volume) {
        super(clear);
        this.volume = volume;
    }

    @Override
    public void fill(){
        this.clear = false;
    };

    @Override
    public void wash() {
        this.clear = true;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "volume=" + volume +
                ", clear=" + clear +
                '}';
    }
}
