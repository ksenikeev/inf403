package ru.itis.inf403.lab2_05;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        for(String n : menu) {
            //System.out.println(n);
        }

        Menu2 menu2 = new Menu2();

        Iterator<String> iterator = menu.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
