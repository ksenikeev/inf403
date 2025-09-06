package ru.itis.inf403.lab2_16;

public class ConcatStr {
    public static void main(String[] args) {
        String[] str = {"str1","str2","str3","str4"};

        String concatenated = String.join(",", str);
        System.out.println(concatenated);
    }
}
