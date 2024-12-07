package ru.itis.inf403.lab09;

import ru.itis.inf403.lab09.model.Teacher;

public class Main {

    public static void main(String[] args) {
        Teacher person = new Teacher("Петров", "Петр", "Петрович", 65); //"Петров", "Петр", "Петрович", 65
        person.setLastName("Петров");


        System.out.println(person);
    }

}
