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

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        //if (!o.getClass().equals(this.getClass())) return false;
        if (this == o) return true;
        Fruit v = (Fruit) o;

        if (this.name.equals(v.name) && this.sugar == v.sugar)
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        int h = super.hashCode();
        for (int i = 0; i < name.length(); ++i) {
            h = h ^ name.charAt(i);
        }

        h = h * sugar * 17;
        return h;
    }
}
