package ru.itis.inf403.lab2_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MainStreamPerson {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        initPersonList(persons);

        // Найти младшего
        Optional<Person> person =
                persons.stream().min((p1, p2) -> p1.getAge() - p2.getAge());

        System.out.println(person.get());

        System.out.println(person.orElse(new Person("Новый", 0)));

        // Вывести только имена заглавными буквами
        persons
                .stream() // Stream<Person>
                .map(p -> p.getName().toUpperCase()) // Stream<String>
                .sorted() // сортируем данные
                .toList() // List<String>
                .forEach(s -> System.out.println(s));

    }

    private static void initPersonList(List<Person> persons) {
        persons.add(new Person("Пушкин", 30));
        persons.add(new Person("Гоголь", 43));
        persons.add(new Person("Маяковский", 21));
        persons.add(new Person("Есенин", 18));
        persons.add(new Person("Паустовский", 24));
        persons.add(new Person("Толстой", 70));
        persons.add(new Person("Достоевский", 25));
    }
}
