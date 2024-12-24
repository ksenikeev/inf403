package ru.itis.inf403.lab13.enum1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(
          "Медведев",
          "Дмитрий",
          "Анатольевич",
          Gender.valueOf("Male"),
          Color.White
        );
        //Color.White.rusName = "Светлый";
        System.out.println(person);


        System.out.println(Gender.findByCode(1));
    }
}
