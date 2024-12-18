package ru.itis.inf403.lab12.list2;

public class List2Direction {

    private Node first;

    public void add(Apple value) {
        if (first == null) {
            first = new Node(value);
        } else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(value);
            current.next.prev = current;

        }
    }

    public boolean add(int position, Apple value) {
        return false;
    }

    public void sort() {

    }

    @Override
    public String toString() {
        return "";
    }

    public Apple pop() {
        return null;
    }

    public Apple remove(int position) {
        return null;
    }

    public void printReverse() {

    }

    public void print() {

    }
}
