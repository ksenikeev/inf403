package ru.itis.inf403.lab2_02.gen;

public class ObjectListTest {
    public static void main(String[] args) {
        addTest();
    }

    public static void addTest() {
        List403Impl<Integer> list = new List403Impl<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        System.out.println(list.get(0) + list.get(1));
    }
}
