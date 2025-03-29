package ru.itis.inf403.independentworks.iw1;

public class Main {
    public static void main(String[] args) {
        Struct3<String> struct1 = new Struct3<>(new String[]{"1", "2", "3"});
        Struct3<Integer> struct2 = new Struct3<>(new Integer[]{1, 2, 3});
        System.out.println(struct1.get(1));
        System.out.println(struct2.get(1));
    }
}
