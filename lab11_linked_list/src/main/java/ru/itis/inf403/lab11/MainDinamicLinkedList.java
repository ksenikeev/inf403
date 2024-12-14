package ru.itis.inf403.lab11;

import java.util.Random;

public class MainDinamicLinkedList {
    public static void main(String[] args) {
        Node first = new Node(5);

        Random random = new Random();

        add(first, random.nextInt(100));
        add(first, 12);
        add(first, 17);
        add(first, 18);
        add(first, 19);
        add(first, 20);
        add(first, 21);

        System.out.println(findLast(first).value);
    }

    /*
     Добавление нового элемента
     1. Ищем последний
     2. Создаем новый
     3. В последнем устанавливаем ссылку на новый
     */

    public static Node findLast(Node first) {
        Node current = first;
        while(current.next != null) {
            current = current.next;
        }
        return current;
    }

    public static void add(Node first, int value) {
        Node last = findLast(first);
        Node newElement = new Node(value);

        last.next = newElement;
    }
}
