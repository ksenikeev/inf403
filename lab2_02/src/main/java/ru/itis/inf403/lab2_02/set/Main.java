package ru.itis.inf403.lab2_02.set;

public class Main {
    public static void main(String[] args) {
/*
        Set403Impl<Integer> set = new Set403Impl<>();

        set.add(1);
        set.add(4);
        set.add(2);
        set.add(1);
        set.add(2);

        System.out.println(set);
*/
        Set403Impl<Fruit> set = new Set403Impl<>();
        set.add(new Fruit("Яблоко", 5));
        set.add(new Fruit("Груша", 7));
        set.add(new Fruit("Апельсин", 2));
        set.add(new Fruit("Яблоко", 5));

        Fruit a[] = set.getAll(new Fruit[0]);
        for(Fruit i : a) {
            System.out.println(i);
        }


    }
}
