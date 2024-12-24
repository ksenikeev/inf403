package ru.itis.inf403.lab13.enum1;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    private Gender gender;
    private Color color;

    public Person(String lastName, String firstName,
                  String middleName, Gender gender, Color color) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.gender = gender;
        this.color = color;
    }

    public String toString() {
        return lastName + " " + firstName + " " + middleName +
                " " + gender + " " + color.rusName;
    }
}
