package ru.PolukarovIvan.lab_24.ex2_Shirt;

public class Shirt {
    private String id;
    private String name;
    private String col;
    private String size;
    private String [] data;

    public Shirt(String str, String sep) {
        this.data = str.split(sep);

        this.id = data[0];
        this.name = data[1];
        this.col = data[2];
        this.size = data[3];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", col='" + col + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
