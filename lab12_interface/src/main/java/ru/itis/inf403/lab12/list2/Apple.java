package ru.itis.inf403.lab12.list2;

public class Apple implements CanCompare {

    private String color;
    private int weight;
    private String kind;
    private int price;

    public Apple(String color, int weight, String kind, int price) {
        this.color = color;
        this.weight = weight;
        this.kind = kind;
        this.price = price;
    }

    @Override
    public int compare(CanCompare other) {
        return this.price - ((Apple)other).price;
    }

    public int getPrice() {
        return price;
    }
}
