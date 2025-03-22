package ru.itis.inf403.lab2_02.set;

public class Fruit {
    private String name;
    private Integer sugar;

    public Fruit(String name, Integer sugar) {
        this.name = name;
        this.sugar = sugar;
    }

    public String getName() {
        return name;
    }

    public Integer getSugar() {
        return sugar;
    }

    @Override
    public String toString() {
        return "Fruit: " + name + ", " + sugar + "%";
    }
}
