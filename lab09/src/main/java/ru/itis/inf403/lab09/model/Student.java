package ru.itis.inf403.lab09.model;

public class Student extends Person {
    private String grouppName;
    private int rating;

    public String getGrouppName() {
        return grouppName;
    }

    Object o;

    public void setGrouppName(String grouppName) {
        this.grouppName = grouppName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
