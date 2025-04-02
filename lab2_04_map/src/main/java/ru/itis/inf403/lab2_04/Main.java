package ru.itis.inf403.lab2_04;

public class Main {
    public static void main(String[] args) {
        Map403<Integer, String> map = new MapImpl<>();

        map.put(1,"Привет");
        map.put(2,"группа");
        map.put(3,"11-403");
        map.put(1,"Пока");

        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
    }
}
