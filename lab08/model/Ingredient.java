package model;

public class Ingredient {

    private String name;

    private int ccal;

    public Ingredient() {}

    public Ingredient(String name, int ccal) {
        this.name = name;
        this.ccal = ccal;
    }

    public String getName() {
        return this.name;
    }

    public String getName(boolean toUpper) {
        return toUpper ? name.toUpperCase() : name;
    }

    public String getCcal() {
        return this.ccal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCcal(int ccal) {
        this.ccal = ccal;
    }
}
