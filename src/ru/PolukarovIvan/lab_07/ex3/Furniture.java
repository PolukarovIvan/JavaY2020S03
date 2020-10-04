package ru.PolukarovIvan.lab_07.ex3;

public abstract class Furniture {
    protected int coast;
    protected int volume;
    protected boolean sold;

    public Furniture(int coast, int volume, boolean sold) {
        this.coast = coast;
        this.volume = volume;
        this.sold = sold;
    }

    public boolean isSold() {
        return sold;
    }

    public int getCoast() {
        return coast;
    }

    public void setCoast(int coast) {
        this.coast = coast;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public abstract String toString();

    public void Sell(){
        this.sold = true;
    };


}
