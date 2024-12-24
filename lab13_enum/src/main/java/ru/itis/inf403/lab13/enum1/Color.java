package ru.itis.inf403.lab13.enum1;

public enum Color {
    Black("Черный"),
    White("Белый"),
    Yellow("Желтый");

    public String rusName;

    Color(String rusName) {
        this.rusName = rusName;
    }
}
