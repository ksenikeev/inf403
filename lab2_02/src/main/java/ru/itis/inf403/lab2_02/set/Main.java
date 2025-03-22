package ru.itis.inf403.lab2_02.set;

public class Main {
    public static void main(String[] args) {
        Set403Impl<Integer> set = new Set403Impl<>();

        set.add(1);
        set.add(4);
        set.add(2);
        set.add(1);
        set.add(2);

        System.out.println(set);

        Integer a[] = set.getAll(new Integer[0]);
        for(Integer i : a) {
            System.out.println(i);
        }


    }
}
