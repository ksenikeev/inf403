package model;

public class Pizza {

    private String name;

    private int weight;

    private float price;

    private int size;

    private Ingredient[] ingredients;

    public Pizza() {}

    public Pizza(String name, int weight, float price, int size, Ingredient[] ingredients) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.size = size;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public float getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }
}
