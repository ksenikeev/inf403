package ru.itis.inf403.lab2_05;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Menu implements Iterable<String> {

    private String dish1;
    private String dish2;
    private String dish3;
    private String dish4;

    public Menu() {
        dish1 = "Рыба";
        dish2 = "Мясо";
        dish3 = "Картошка";
        dish4 = "Макароны";
    }

    public Iterator<String> iterator() {
        return new Menu2Iterator();
    }

    class Menu2Iterator implements Iterator<String> {
        private int currentIndex = 0;

        public boolean hasNext() {
            return currentIndex < 4;
        }

        public String next() {
            if (currentIndex == 4) {
                throw new NoSuchElementException();
            }
            return switch (currentIndex++) {
                case 0 -> dish1;
                case 1 -> dish2;
                case 2 -> dish3;
                case 3 -> dish4;
                default -> throw new NoSuchElementException();
            };
        }
    }

}
